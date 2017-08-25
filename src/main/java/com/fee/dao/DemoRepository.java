package com.fee.dao;

import com.fee.bean.Demo;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepository extends CrudRepository<Demo, Long> {
}
