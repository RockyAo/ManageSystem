package com.rocky.ao;

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
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class);
    }
}
