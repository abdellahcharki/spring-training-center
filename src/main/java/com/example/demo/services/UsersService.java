package com.example.demo.services;
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClassRoomRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dao.TeacherRepository;
import com.example.demo.models.Room;
import com.example.demo.models.Employees;
import com.example.demo.models.Student;
import com.example.demo.models.Teacher; 
 

@Service
public class UsersService  {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ClassRoomRepository classRoomRepository;

  
 
	
	public Page<Room> getClassRooms(int page, int size){
		
		return   classRoomRepository.findAll(PageRequest.of(page, size));
	}

 
	public Page<Student> findStudents(String q,Pageable pageable) { 
		return studentRepository.search(q,pageable );
	}
	

	 
	public Page<Teacher> findTeachers(String q,Pageable pageable) { 
		return  teacherRepository.search(q, pageable);
	}
	
	public Page<Employees> findEmployees(String q,int page, int size, String sort){

		return  employeeRepository.search(q,PageRequest.of(page, size,Sort.by(sort)));
	}
	
		
	
}
