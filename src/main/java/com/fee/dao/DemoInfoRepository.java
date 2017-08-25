package com.fee.dao;

import com.fee.bean.DemoInfo;
import org.springframework.data.repository.CrudRepository;

public interface DemoInfoRepository  extends CrudRepository<DemoInfo,Long> {
}
