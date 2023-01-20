package com.example.demo.controllers;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 

import com.example.demo.models.Room;
import com.example.demo.models.Employees;
import com.example.demo.models.Student;
import com.example.demo.models.Teacher;
import com.example.demo.services.UsersService;
import com.example.demo.utils.ResponseHttp; 
 

@RestController
@RequestMapping("/api/hr")
@CrossOrigin()
public class HrController {

	private final String DEFUALT_SIZE_OF_PAGE ="10";
	
	@Autowired
	UsersService usersService;
	
	
 
	
	@GetMapping("eleves")
	public ResponseEntity<?> findStudent(@RequestParam String q,@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = DEFUALT_SIZE_OF_PAGE)  int size , @RequestParam(defaultValue = "id") String sort){
		
		q=q.trim();
	 
		Pageable pageable =  (Pageable)   PageRequest.of(page,size,Sort.by(sort));
		
		Page<Student> list = usersService.findStudents(q, pageable) ;


	 
		ResponseHttp<List<Student>> res =  new ResponseHttp<>();
		
		res
			.set(list.toList())
			.put("number_of_pages",list.getTotalPages())
			.put("size",size)
			.put("sort", sort)
			.put("page",page);
		
		return ResponseEntity.ok(res);
	}
	
	@GetMapping("teachers")
	public ResponseEntity<?> findTeacher(@RequestParam(defaultValue = "") String q,@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = DEFUALT_SIZE_OF_PAGE)  int size , @RequestParam(defaultValue = "id") String sort){

		q=q.trim();
	 
		Pageable pageable =  (Pageable)   PageRequest.of(page,size,Sort.by(sort));
		
		Page<Teacher> list = usersService.findTeachers(q, pageable) ;


	 
		ResponseHttp<List<Teacher>> res =  new ResponseHttp<>();
		
		res
			.set(list.toList())
			.put("number_of_pages",list.getTotalPages())
			.put("size",size)
			.put("sort", sort)
			.put("page",page);
		
		return ResponseEntity.ok(res);
	}
	
	
	
	
	@GetMapping("employees")
	public ResponseEntity<?> getEmployees(@RequestParam(defaultValue = "") String q,@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = DEFUALT_SIZE_OF_PAGE)  int size, @RequestParam(defaultValue = "id") String sort ){

		q=q.trim();
		ResponseHttp<List<Employees>> rep = new ResponseHttp<>();
		
		Page<Employees> list = usersService.findEmployees(q,page,size,sort);
		
		rep
			.put("page", page)
			.put("number_of_pages", list.getTotalPages())
			.put("size",size)
			.set(list.toList());
		
		return ResponseEntity.ok(rep);	
	}
	
 
	@GetMapping("classrooms")
	public List<Room> getClassRooom(@RequestParam(defaultValue = "0") int page,@RequestParam(defaultValue = DEFUALT_SIZE_OF_PAGE)  int size ){
		return usersService.getClassRooms(page,size).toList();	
	}
		
}
