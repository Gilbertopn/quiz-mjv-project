package com.mjvquiz.controller;

import com.mjvquiz.dto.QuestionDTO;
import com.mjvquiz.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    private final QuestionService questionService;
    @PostMapping
    public ResponseEntity<QuestionDTO> create(@RequestBody QuestionDTO questionDTO){
        QuestionDTO questionDTO1 = questionService.save(questionDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(questionDTO1);
    }
}
