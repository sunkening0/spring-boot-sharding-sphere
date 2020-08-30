package com.itstyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SubDBTableApplication {

    private static final Logger logger = LoggerFactory.getLogger(SubDBTableApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SubDBTableApplication.class, args);
        logger.info("分库分表案例启动");
    }
}
