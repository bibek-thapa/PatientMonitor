//package com.example.scheduledtask;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import com.example.entity.Patient;
//
//
//
//@Component
//public class PostSchedule {
//	
//
//
//	private static final Logger log = LoggerFactory.getLogger(PostSchedule.class);
//	
//	@Scheduled(cron="*/1 * * * * ?")
//    public void demoServiceMethod()
//    {
//        
//        final String uri = "http://localhost:8082/patient/insert";
//        RestTemplate restTemplate = new RestTemplate();
//        Map<String,String> patientMap = new HashMap<>();
//        patientMap.put("firstName", "Ram");
//        patientMap.put("lastName", "Karki");
//        patientMap.put("email", "ramkarki1@gmail.com");
//        
//        ResponseEntity<Patient> response = restTemplate.postForEntity(uri, patientMap, Patient.class);
//
//		
//        if (response.getStatusCode() == HttpStatus.OK) {
//            System.out.println("Request Successful");
//        } else {
//            System.out.println("Request Failed");
//        }
//      
//    
//    }
//
//}
