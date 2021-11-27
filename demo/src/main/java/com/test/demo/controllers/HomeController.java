package com.test.demo.controllers;

import com.test.demo.model.dto.StudentDto;
import com.test.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
@CrossOrigin
public class HomeController {

//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/")
//    public ResponseEntity<String> home(){
//        return new ResponseEntity<>("Welcome Home", HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto){
//        StudentDto savedStudentDto = studentService.saveStudent(studentDto);
//        return new ResponseEntity<>(savedStudentDto, HttpStatus.CREATED);
//    }
//
//    @GetMapping("student/{id}")
//    public ResponseEntity<StudentDto> getStudent(@PathVariable String id){
//        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
//    }
}
