package com.atguigu.atcrowdfunding.manager.controller;

import com.atguigu.atcrowdfunding.manager.dao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wyy
 * @Date: 2019/10/15 0015
 * @Description: com.atguigu.atcrowdfunding.manager.controller
 * @version: 1.0
 */
@Controller
public class TestController {

        @Autowired
        private TestService testService ;

        @RequestMapping("/test")
        public String test(){
            System.out.println("TestController");

            testService.insert();

            return "success";
        }


}
