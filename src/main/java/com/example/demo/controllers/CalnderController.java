package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Holiday;
import com.example.demo.services.CalanderService;

@RestController
@RequestMapping("/api/calander")
@CrossOrigin(origins = "http://localhost:4200")
public class CalnderController {

	@Autowired
	CalanderService calanderService;


	@GetMapping("holiday")
	List<Holiday> getAllHolidays(){
		return calanderService.getAllHolidays();
	}
}
