package com.rocky.ao;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yun.ao
 * @date 2023/1/8 22:17
 * @description
 */
@SpringBootApplication
@MapperScan("com.rocky.ao.mapper")
@Slf4j
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class);
        log.info("server start successful");
    }
}
