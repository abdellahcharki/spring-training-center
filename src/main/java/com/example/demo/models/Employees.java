package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Employees {
	
	@Id @GeneratedValue
	private Long id;
	private String lastName;
	private String firstName;
	private String cni;
	private String tele;
	private boolean accountLocked;
	private String sex;
	private String email;
	
	public Employees() {}
	
	public Employees(String lastName,String firstName,String email,String cni ,String tele,String sex,boolean accountLocked) {
		this.lastName=lastName;
		this.firstName=firstName;
		this.tele=tele;
		this.cni=cni;
		this.sex=sex;
		this.email=email;
		this.accountLocked = accountLocked;
	}
 
	
	
	
	
	
	
	
}
