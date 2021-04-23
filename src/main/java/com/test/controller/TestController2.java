package com.test.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController2 {

    //定义日志变量
    private static final Logger logger = LogManager.getLogger(TestController2.class.getName());

    @RequestMapping("/test2")
    public String logTest2(){
        //logger.trace("trace msg");
        //logger.debug("debug msg");
        logger.info("info msg test2");
        //logger.warn("warn msg");
        //logger.error("error msg");
        //logger.fatal("fatal msg");
        return "success";
    }

}
