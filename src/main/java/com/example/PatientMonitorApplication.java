package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan("com.example.entity")
@EnableScheduling
public class PatientMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientMonitorApplication.class, args);
	}

}
