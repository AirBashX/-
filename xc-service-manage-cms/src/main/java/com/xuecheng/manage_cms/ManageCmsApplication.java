package com.xuecheng.manage_cms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther ZSP
 */
@SpringBootApplication(scanBasePackages = {"com.xuecheng.api","com.xuecheng.manage_cms"})
//@ComponentScan(basePackages = "com.xuecheng.api")
//@ComponentScan(basePackages = "com.xuecheng.manage_cms")
//@EntityScan("com.xuecheng.framework.dmain.cms")
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
    }
}
