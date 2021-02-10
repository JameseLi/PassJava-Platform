package com.jackson0714.passjava.channel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lee
 */
@MapperScan(basePackages = "com.jackson0714.passjava.channel.dao")
@SpringBootApplication
public class PassjavaChannelApplication {
    public static void main(String[] args) {
        SpringApplication.run(PassjavaChannelApplication.class, args);
    }
}