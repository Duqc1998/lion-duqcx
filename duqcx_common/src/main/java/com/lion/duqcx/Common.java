package com.lion.duqcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Common {
    public static void main(String[] args) {
        System.out.println("开始启动工程");
        SpringApplication.run(Common.class, args);
        System.out.println("工程启动结束");
    }
}
