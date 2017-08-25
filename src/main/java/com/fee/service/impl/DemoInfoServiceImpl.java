package com.fee.service.impl;

import com.fee.bean.DemoInfo;
import com.fee.dao.DemoInfoRepository;
import com.fee.service.DemoInfoService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Mars on 2017/8/7.
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {
    @Resource
    private DemoInfoRepository demoInfoRepository;

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public void test(){
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("mykey4", "random1="+Math.random());
        System.out.println(valueOperations.get("mykey4"));
    }

  //  @CacheEvict(value="demoInfo",allEntries=true)// 清空accountCache 缓存
//    @CacheEvict(value="demoInfo")// 清空accountCache 缓存
    @CachePut(value="demoInfo")
    @Override
    public void save(DemoInfo loaded) {
        demoInfoRepository.save(loaded);
    }

    //keyGenerator="myKeyGenerator"
    @Cacheable(value="demoInfo") //缓存,这里没有指定key.
    @Override
    public DemoInfo findById(long id) {
        System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);
        return demoInfoRepository.findOne(id);
    }

    @CacheEvict(value="demoInfo") //根据一定的条件对缓存进行清空
    @Override
    public void deleteFromCache(long id) {
        System.out.println("DemoInfoServiceImpl.delete().从缓存中删除.");
    }


    @CacheEvict(value="save2",allEntries=true)// 清空accountCache 缓存
    @Override
    public void save2(DemoInfo loaded) {
        demoInfoRepository.save(loaded);
    }
}
