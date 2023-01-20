package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
	
@Entity @Data
public class Student {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String firstName; 
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = true) 
	private  String cni;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false) 
	private  String tele;
	
	@Column(nullable = false)
	private String sex;
	
	public Student() {}
	
	public Student( String firstName, String lastName, String cni, String email, String tele,String sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cni = cni;
		this.email = email;
		this.tele = tele;
	}
	
}
