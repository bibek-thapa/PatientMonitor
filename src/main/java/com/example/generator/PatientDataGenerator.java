package com.example.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PatientDataGenerator {
	
	List<Object> randomData = new ArrayList<>();
	Map<String,Integer> randomMap = new HashMap<>();
	
	public Map<String,Integer> getData()
	{
		
		int temp = getRandomNumberInRange(1, 100);
		int heartRate = getRandomNumberInRange(60, 100);
		int respiratoryRate = getRandomNumberInRange(12, 18);
		int bloodPressureHigh = getRandomNumberInRange(60, 80);
		int bloodPressureLow = getRandomNumberInRange(80, 120);
		
		randomMap.put("temperature", temp);
		randomMap.put("heartRate", heartRate);
		randomMap.put("respiratoryRate", respiratoryRate);
		randomMap.put("bloodPressureHigh", bloodPressureHigh);
		randomMap.put("bloodPressureLow", bloodPressureLow);

		
	
		return randomMap;
		
		
	}
	
	
	
	
	public int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}




	
	
	



}
