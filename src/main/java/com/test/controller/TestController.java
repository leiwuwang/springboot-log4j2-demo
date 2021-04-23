package com.test.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description 测试类
 * @Author ray
 * @Date 2021/4/22 17:41
 **/
@RestController
@RequestMapping("/")
public class TestController {

    //定义日志变量
    private static final Logger logger = LogManager.getLogger(TestController.class.getName());

    /**
     * @Description: 测试日志方法
     * @Author: Ray
     * @Date: 2021/4/22 17:57
     **/
    @RequestMapping("/test")
    public String logTest(){
        //logger.trace("trace msg");
        //logger.debug("debug msg");
        logger.info("info msg");
        //logger.warn("warn msg");
        //logger.error("error msg");
        //logger.fatal("fatal msg");
        return "success";
    }

    //测试
    //测试
    //测试
    //测试
    //测试
    //测试
    //测试

}
