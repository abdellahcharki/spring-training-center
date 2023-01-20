package com.example.demo.models;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity @Data 
public class Session {
	
	@Id @GeneratedValue
	private int id;
	@ManyToOne
	Day day;
	
	@OneToOne
	private Room room;
	
	@OneToOne
	Group group;
	
	private Time startTime;
	private Time endTime;
 
	
}
