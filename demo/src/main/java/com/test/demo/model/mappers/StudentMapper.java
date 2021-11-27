package com.test.demo.model.mappers;

import com.test.demo.model.dto.StudentDto;
import com.test.demo.model.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student toEntity(StudentDto studentDto){
        return new Student(studentDto.getId(), studentDto.getName());
    }

    public StudentDto toDto(Student student){
        return new StudentDto(student.getId(), student.getName());
    }
}
