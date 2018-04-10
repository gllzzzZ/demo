package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo_customer.xml")
@SpringBootApplication



public class Start {
	
	public static void main(String[] args) throws Exception {

    	//springboot启动命令

        SpringApplication.run(Start.class, args);
    }

}
