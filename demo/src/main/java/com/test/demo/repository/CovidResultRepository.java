package com.test.demo.repository;

import com.test.demo.model.entity.CovidResult;
import com.test.demo.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CovidResultRepository extends JpaRepository<CovidResult, Integer> {
    List<CovidResult> findByUserIdIn(List<User> ids);
}
