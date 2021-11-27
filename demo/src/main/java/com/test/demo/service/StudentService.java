package com.test.demo.service;

import com.test.demo.model.dto.StudentDto;
import com.test.demo.model.entity.Student;
import com.test.demo.model.mappers.StudentMapper;
import com.test.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper mapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentMapper mapper){
        this.studentRepository = studentRepository;
        this.mapper = mapper;
    }

    public StudentDto saveStudent(StudentDto studentDto){
        return mapper.toDto(studentRepository.save(mapper.toEntity(studentDto)));
    }

    public StudentDto getStudentById(String id){
        return mapper.toDto(studentRepository.findById(id).get());
    }
}

