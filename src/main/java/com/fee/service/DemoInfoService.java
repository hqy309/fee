package com.fee.service;

import com.fee.bean.DemoInfo;

public interface DemoInfoService {
    public DemoInfo findById(long id);

    public void deleteFromCache(long id);

    void test();

    void save(DemoInfo loaded);

    void save2(DemoInfo demoInfo);
}
