package com.stackroute.studentapp.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.studentapp.model.Student;
import com.stackroute.studentapp.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentService studservice;
	
	
	@GetMapping("/student/viewall")
	public ResponseEntity<?> getall()
	{
		List<Student> students=studservice.viewStudents();
		
		return new ResponseEntity<List>(students,HttpStatus.OK);
		
	}
	
	@PostMapping("/student/add")

	public ResponseEntity<?> addstudent(@RequestBody Student stud)
	{
		Student result=studservice.addStudent(stud);
		return new ResponseEntity<Student>(result,HttpStatus.CREATED);
		
	}
	
}
