package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//data access layer
//responsible for data access
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    // we want to make a function which gives the query: SELECT * FROM student WHERE email = ?
    //@Query("SELECT s FROM Student s WHERE s.email= ") we could run this directly??
    Optional<Student> findStudentByEmail(String email);
}
