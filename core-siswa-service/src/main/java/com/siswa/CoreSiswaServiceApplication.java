package com.siswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CoreSiswaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreSiswaServiceApplication.class, args);
	}
}
