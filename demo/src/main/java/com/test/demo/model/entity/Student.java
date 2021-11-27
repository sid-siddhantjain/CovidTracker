package com.test.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Table(name = "Student")
@Entity
public class Student {
    @Column(name="id")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    public Student() {

    }
}
