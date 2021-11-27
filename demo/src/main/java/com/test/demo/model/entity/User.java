package com.test.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Column
    @GeneratedValue
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private Integer pincode;

    @Column
    private Boolean isAdmin;
}
