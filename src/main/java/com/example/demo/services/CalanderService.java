package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HolidayRepository;
import com.example.demo.models.Holiday;

@Service
public class CalanderService {
	
	@Autowired
	HolidayRepository holidayRepository;

	public List<Holiday> getAllHolidays(){
		
		return holidayRepository.findAll();
	}
}
