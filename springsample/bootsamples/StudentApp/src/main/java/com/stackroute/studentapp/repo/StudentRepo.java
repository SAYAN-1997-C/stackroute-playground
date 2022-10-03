package com.stackroute.studentapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.studentapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,String>{

}
