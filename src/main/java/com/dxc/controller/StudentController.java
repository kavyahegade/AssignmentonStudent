package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Student;

import com.dxc.service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	StudentServiceImpl service;
	
	
	@GetMapping("/all")
    public List<Student> getAllStudent(){
        return service.getAllStudent();

	}

	

	@GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
          return service.getStudentById(id);

	}

    @PostMapping("/add")
   public Student insertStudent(@RequestBody Student s) {
        return service.insertStudent(s);

	}

   @PutMapping("/update")
   public Student updateStudentDetails(@RequestBody Student s) {
          return service.updateStudent(s);

	}

   @GetMapping("/students/afterDelete/{id}")
   public List<Student> deleteStudent(@PathVariable int id){
         service.deleteStudent(id);
         return service.getAllStudent();

	}
}
