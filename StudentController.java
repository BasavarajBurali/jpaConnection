package com.example.jpaCon;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    StudentService studentservice;
//GET METHOD
    @GetMapping("/get-all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(studentservice.findAllStudents());
    }

//POST METHOD
    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody Student student){

        return  ResponseEntity.ok(studentservice.addStudent(student));
    }


//    @GetMapping("/student-detail")
//    public ResponseEntity getById(@RequestParam int id){
//        return ResponseEntity.ok(studentservice.getById(id));
//    }

    @GetMapping( "/student-detail/{id}")
    public ResponseEntity getById(@PathVariable int id){
        return ResponseEntity.ok(studentservice.getById(id));
    }


//    public void deleteStudent(@PathVariable int id){
//        this.studentservice.deleteStu(id);
//    }


}
