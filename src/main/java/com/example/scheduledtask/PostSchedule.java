package com.example.scheduledtask;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Patient;
import com.example.entity.VitalParam;
import com.example.generator.PatientDataGenerator;



@Component
public class PostSchedule {
	


	private static final Logger logger = LoggerFactory.getLogger(PostSchedule.class);
	
	@Scheduled(cron="*/1 * * * * ?")
    public void demoServiceMethod()
    {
        Long id = 2l ;
        final String uri = "http://localhost:8082/patient/"+id+"/vitalParams";
        
        Map<String,String> patientMap = new HashMap<>();
      
        RestTemplate restTemplate = new RestTemplate();
        PatientDataGenerator patientDataGenerator = new PatientDataGenerator();
        patientMap = patientDataGenerator.getData();
        
        ResponseEntity<VitalParam> response = restTemplate.postForEntity(uri, patientMap, VitalParam.class);
        logger.info("Response is {}", response);
		
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful");
        } else {
            System.out.println("Request Failed");
        }
      
    
    }

}
