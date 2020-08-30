package com.itstyle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DBReadWriteApplication {

    private static final Logger logger = LoggerFactory.getLogger(DBReadWriteApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DBReadWriteApplication.class, args);
        logger.info("读写分离案例启动");
    }
}
