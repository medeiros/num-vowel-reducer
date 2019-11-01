package com.arneam.numvowelreducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NumVowelReducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumVowelReducerApplication.class, args);
	}

}
