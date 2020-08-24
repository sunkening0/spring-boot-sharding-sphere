package com.itstyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SubTableApplication {

    private static final Logger logger = LoggerFactory.getLogger(SubTableApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SubTableApplication.class, args);
        logger.info("分表案例启动");
    }
}
