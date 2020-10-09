package com.bharath.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.student.dal.entity.Student;
import com.bharath.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student entity = new Student();
		entity.setName("John");
		entity.setCourse("Web service class");
		entity.setFee(30d);
		studentRepository.save(entity);
	}
	@Test
	public void testFindStudentById() {
		Optional<Student> one = studentRepository.findById(1L);
		System.out.println(one.get());
	}
	
	@Test
	public void testUpdateStudent() {
		Student one = studentRepository.findById(1L).get();
		one.setFee(40d);
		studentRepository.save(one);
	}

	@Test
	public void testDeleteStudent() {
		Student one = new Student();
		one.setId(1L);
		studentRepository.delete(one);
	}
}
