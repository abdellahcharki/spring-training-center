package com.example.demo.dao;
 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Employees; 

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long>  {
	

	@Query("from Employees s where  s.lastName || ' '|| s.firstName LIKE %:q% or s.cni LIKE %:q% or s.email LIKE %:q%  ")
	public Page<Employees> search(@Param("q") String q,Pageable pageable );


}
