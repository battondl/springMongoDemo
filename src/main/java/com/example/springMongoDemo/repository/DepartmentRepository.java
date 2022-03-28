package com.example.springMongoDemo.repository;

import com.example.springMongoDemo.dtos.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
