package com.example.springMongoDemo.controller;


import com.example.springMongoDemo.dtos.Student;
import com.example.springMongoDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student studentDto) {
        Student result = studentService.createStudent(studentDto);
        return result;
    }

    @GetMapping("/getById/{id}")
    public Student getStudentbyId(@PathVariable String id) {
        return studentService.getStudentbyId(id).get();
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {

        return studentService.deleteStudent(id);
    }

    @GetMapping("/studentsByName/{name}")
    public List<Student> studentsByName(@PathVariable String name) {

        return studentService.getStudentsByName(name);
    }

    @GetMapping("/studentByNameAndEmail")
    public Student studentByNameAndEmail(@RequestParam String name,
                                         @RequestParam String email) {
        return studentService.studentByNameAndEmail(name, email);
    }

    @GetMapping("/studentsByNameOrEmail")
    public List<Student> studentByNameOrEmail(@RequestParam String name,
                                        @RequestParam String email) {
        return studentService.studentsByNameOrEmail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(@RequestParam int pageNo,
                                              @RequestParam int pageSize) {
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSorting")
    public List<Student> allWithSorting() {

        return studentService.allWithSorting();
    }

    @GetMapping("/byDepartmentName")
    public List<Student> byDepartmentName(@RequestParam String deptName) {
        return studentService.byDepartmentName(deptName);
    }

    @GetMapping("/byDepartmentLocation")
    public List<Student> byDepartmentLocation(@RequestParam String location) {
        return studentService.byDepartmentLocation(location);
    }

    @GetMapping("/bySubjectName")
    public List<Student> bySubjectName(@RequestParam String subjectName) {

        return studentService.bySubjectName(subjectName);
    }

    @GetMapping("/emailLike")
    public List<Student> emailLike(@RequestParam String email) {

        return studentService.emailLike(email);
    }

    @GetMapping("/nameStartsWith")
    public List<Student> nameStartsWith(@RequestParam String name) {

        return studentService.nameStartsWith(name);
    }

    @GetMapping("/byDepartmentId")
    public List<Student> byDepartmentId(@RequestParam String departmentId) {
        return studentService.byDepartmentId(departmentId);
    }

    @GetMapping("/getByName/{name}")
    public List<Student> getStudentByName(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }
}
