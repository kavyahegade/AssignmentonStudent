package com.dxc.service;

import java.util.List;

import com.dxc.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();
    public Student getStudentById(int id);
    public Student insertStudent(Student s);
    public Student updateStudent(Student s);
    public void deleteStudent(int id);
	

}
