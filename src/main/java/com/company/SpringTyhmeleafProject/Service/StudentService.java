package com.company.SpringTyhmeleafProject.Service;

import com.company.SpringTyhmeleafProject.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student>getAllStudent();
    void saveStudent(Student student);
    Student getStudentById(Integer id);
    void deleteStudent(Integer id);
}
