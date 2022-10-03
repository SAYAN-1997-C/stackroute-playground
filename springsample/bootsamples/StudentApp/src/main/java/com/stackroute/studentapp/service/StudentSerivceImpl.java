package com.stackroute.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.studentapp.model.Student;
import com.stackroute.studentapp.repo.StudentRepo;


@Service
public class StudentSerivceImpl implements StudentService{

	
	@Autowired
	StudentRepo studentrepo;
	
	@Override
	public Student addStudent(Student obj) {
		Student result= studentrepo.save(obj);
		return result;
	}

	@Override
	public List<Student> viewStudents() { 
		
		return studentrepo.findAll();
	}

}
