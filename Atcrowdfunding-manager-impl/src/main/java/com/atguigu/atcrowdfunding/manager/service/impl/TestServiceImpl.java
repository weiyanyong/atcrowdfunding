package com.atguigu.atcrowdfunding.manager.service.impl;

import com.atguigu.atcrowdfunding.manager.dao.TestDao;
import com.atguigu.atcrowdfunding.manager.dao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wyy
 * @Date: 2019/10/15 0015
 * @Description: com.atguigu.atcrowdfunding.manager.service.impl
 * @version: 1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao ;

    @Override
    public void insert() {
        Map map = new HashMap();
        map.put("name", "zhang3");
        testDao.insert(map);
    }

}
