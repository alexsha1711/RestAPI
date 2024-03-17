package com.example.restapi.dao;

import com.example.restapi.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question,Integer> {


}
