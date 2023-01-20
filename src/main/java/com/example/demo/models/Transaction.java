package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity @Data
public class Transaction {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String label;
	private int montant;
	
	public Transaction() {}
	
	Transaction(String label,int montant){
		this.label=label;
		this.montant=montant;
	}
	
}
