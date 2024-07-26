package com.company.Vertical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VerticalApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerticalApplication.class, args);
	}

}
