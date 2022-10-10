package com.stackroute.Sampleeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SampleeurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleeurekaclientApplication.class, args);
	}

}
