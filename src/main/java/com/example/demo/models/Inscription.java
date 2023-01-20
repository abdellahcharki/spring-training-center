package com.example.demo.models;

import java.sql.Date; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data; 

@Entity @Data
public class Inscription {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	int price;
	
	@Column(name = "date_inscription")
	Date  date;
	 
	@ManyToOne
	Student student;
	
	@ManyToOne()
	Group group;
	
	
	
}
