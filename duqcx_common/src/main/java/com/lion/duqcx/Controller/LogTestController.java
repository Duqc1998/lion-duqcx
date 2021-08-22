package com.lion.duqcx.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogTestController {

    Logger logger = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/")
    public String hello(){
        int i = 0;
        while (i < 9999){
            logger.error("错误日志>>>"+i);
            logger.debug("DeBug日志>>>"+i);
            logger.info("info日志>>>"+i);
            logger.trace("trace日志>>>"+i);
            i++;
        }
        return "整合日志";
    }


}
