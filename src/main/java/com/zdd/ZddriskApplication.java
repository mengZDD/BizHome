package com.zdd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.zdd.risk.dao")
public class ZddriskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZddriskApplication.class, args);
	}
}
