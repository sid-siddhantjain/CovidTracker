package com.test.demo.model.entity;

import com.test.demo.model.CovidResultEnum;
import com.test.demo.model.CovidResultId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "CovidResult")
@Entity
@Getter
@Setter
@Accessors(chain = true)
public class CovidResult {
    @Id
    private Integer userId;

    private Integer adminId;
    private boolean covidResult;
}
