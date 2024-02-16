package com.company.SpringTyhmeleafProject.Repository;

import com.company.SpringTyhmeleafProject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
