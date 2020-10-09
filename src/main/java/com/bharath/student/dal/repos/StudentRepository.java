package com.bharath.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.student.dal.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
