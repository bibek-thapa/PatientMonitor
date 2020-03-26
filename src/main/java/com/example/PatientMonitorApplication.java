package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan("com.example.entity")
@EnableScheduling
@EnableJpaAuditing
public class PatientMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientMonitorApplication.class, args);
	}

}
