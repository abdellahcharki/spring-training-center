package com.example.demo.utils;
 
 
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.HolidayRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dao.TeacherRepository;
import com.example.demo.models.Holiday;
 

@Component
public class Runner implements CommandLineRunner  {

	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	StudentRepository studenRepository;
	

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	HolidayRepository holidayRepository;
	
	
	@Override
	public void run(String... args) throws Exception { 


	}

}
