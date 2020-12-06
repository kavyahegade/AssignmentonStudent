package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Student;
import com.dxc.repo.StudentRepository;
@Service
public class StudentServiceImpl {
	   @Autowired
	  StudentRepository repository;
	   
	  public List<Student> getAllStudent() {
           // TODO Auto-generated method stub
           return repository.findAll();

		}

      public Student getStudentById(int id) {
         // TODO Auto-generated method stub
           Optional<Student> student=repository.findById(id);
           return student.get();
      }


       public Student insertStudent(Student s) {
            // TODO Auto-generated method stub
           return repository.save(s);

		}

        public Student updateStudent(Student s) {
             // TODO Auto-generated method stub
            Optional<Student> stu=repository.findById(s.getId());
            Student student=stu.get();
            student.setLast_name(s.getLast_name());
           return repository.save(student);

		}

       public void deleteStudent(int id) {
             // TODO Auto-generated method stub
              repository.deleteById(id);

		}

	   
	   

}
