package com.mjvquiz.service;

import com.mjvquiz.build.QuestionMapper;
import com.mjvquiz.dto.QuestionDTO;
import com.mjvquiz.repository.QuestionRepository;
import com.mjvquiz.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class QuestionService {

    @Autowired
    private final QuestionRepository questionRepository;
    @Autowired
    private final QuestionMapper questionMapper;


    public QuestionDTO save (QuestionDTO questionDTO){
        return questionMapper.toDTO(questionRepository.save(questionMapper.toEntity(questionDTO)));
    }


}
