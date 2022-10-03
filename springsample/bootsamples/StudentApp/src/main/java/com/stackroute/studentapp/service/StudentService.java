package com.stackroute.studentapp.service;

import java.util.List;

import com.stackroute.studentapp.model.Student;

public interface StudentService {

	   Student addStudent(Student obj);
	   List<Student> viewStudents();
	
}
