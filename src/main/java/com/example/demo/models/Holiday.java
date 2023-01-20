package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity @Data
public class Holiday {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String label;

	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Holiday() {}
	
	public Holiday(String label, Date date) {
		this.label = label;
		this.date = date;
	} 
	
}
