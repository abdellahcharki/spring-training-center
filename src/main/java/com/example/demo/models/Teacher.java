package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Teacher {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String firstName; 
	
	@Column(nullable = false)
	private String lastName;
	
	private String cni;
	private String tele;
	private String email;
	private String sex;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String lastName,String firstName,String cni ,String tele, String email,String sex) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.tele = tele;
		this.email = email;
		this.sex= sex;
		this.cni=cni;
	}
 
	
}
