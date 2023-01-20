package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Entity @Data
@Table(name = "groups")
public class Group {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY)
	List<Inscription> inscription;
	
	public Group(String name) {
		this.name = name;
	}
	
}
