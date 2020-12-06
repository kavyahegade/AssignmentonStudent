package com.dxc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	

}
