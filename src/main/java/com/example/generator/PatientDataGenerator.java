package com.example.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.scheduledtask.PostSchedule;

public class PatientDataGenerator {
	
	List<Object> randomData = new ArrayList<>();
	Map<String,String> randomMap = new HashMap<>();
	private static final Logger logger = LoggerFactory.getLogger(PostSchedule.class);

	public Map<String,String> getData()
	{
		
		String temp = getRandomNumberInRange(1, 100);
		String heartRate = getRandomNumberInRange(60, 100);
		String respiratoryRate = getRandomNumberInRange(12, 18);
		String bloodPressureHigh = getRandomNumberInRange(60, 80);
		String bloodPressureLow = getRandomNumberInRange(80, 120);
		
		randomMap.put("temperature", temp);
		randomMap.put("heartRate", heartRate);
		randomMap.put("respiratoryRate", respiratoryRate);
		randomMap.put("bloodPressureHigh", bloodPressureHigh);
		randomMap.put("bloodPressureLow", bloodPressureLow);
	

		logger.info("Random map for  with data{}", randomMap);

		
		return randomMap;
		
		
	}
	
	
	
	
	public String getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return Integer.toString( r.nextInt((max - min) + 1) + min);
	}




	
	
	



}
