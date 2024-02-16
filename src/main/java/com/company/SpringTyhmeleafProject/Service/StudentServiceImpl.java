package com.company.SpringTyhmeleafProject.Service;

import com.company.SpringTyhmeleafProject.Model.Student;
import com.company.SpringTyhmeleafProject.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll() ;
    }

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student>optional=studentRepository.findById(id);
        Student student=null;
        if (optional.isPresent()){
            student=optional.get();
        }else {
            throw new RuntimeException("Student not found for id:"+id);
        }
        return student;
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
