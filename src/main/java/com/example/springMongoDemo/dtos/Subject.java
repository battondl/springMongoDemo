package com.example.springMongoDemo.dtos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "subject")
public class Subject {

    @Id
    private String id;

    @Field(name = "subject_name")
    private String subjectName;

    @Field(name = "marks_obtained")
    private Float grade;

    public Subject() {
    }

    public Subject(String subjectName, Float grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }
}
