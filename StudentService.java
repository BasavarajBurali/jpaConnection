package com.example.jpaCon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    @Autowired
    StudentRepo studentrepo;


    public List<Student> findAllStudents() {
        return studentrepo.findAll();
    }

    public Student addStudent(Student student) {
        return  studentrepo.save(student);
    }


    public Optional<Student> getById(int id) {
        return studentrepo.findById(id);
    }

  


}
