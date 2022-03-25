package com.example.springMongoDemo.repository;


import com.example.springMongoDemo.dtos.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    Student findByEmailAndName (String email, String name);

    List<Student> findByNameOrEmail (String name, String email);

    List<Student> findByDepartmentDepartmentName(String deptname);

    List<Student> findByDepartmentLocation(String location);

    List<Student> findBySubjectsSubjectName (String subjectName);

    List<Student> findByEmailIsLike (String email);

    List<Student> findByNameStartsWith (String name);

}
