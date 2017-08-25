package com.fee.service;

import com.fee.bean.Demo;
import com.fee.dao.DemoDao;
import com.fee.dao.DemoRepository;
import com.fee.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Mars on 2017/8/4.
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;

    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo){
        demoRepository.save(demo);
    }

    public Demo getById(Long id) {
        return demoDao.getById(id);
    }


    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName(name);
    }
}
