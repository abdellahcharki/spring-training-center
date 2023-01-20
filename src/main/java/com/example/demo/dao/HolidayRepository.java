package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Integer> {

}
