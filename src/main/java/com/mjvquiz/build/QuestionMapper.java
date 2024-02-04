package com.mjvquiz.build;


import com.mjvquiz.dto.QuestionDTO;
import com.mjvquiz.model.Question;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    private final ModelMapper modelMapper;

    public QuestionMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public QuestionDTO toDTO(Question model) {
        return modelMapper.map(model, QuestionDTO.class);
    }

    public Question toEntity(QuestionDTO dto) {
        return modelMapper.map(dto, Question.class);
    }

    public ArrayList<QuestionDTO> toListDTO(List<Question> modelList) {
        return modelList.stream()
                .map(this::toDTO).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Question> toList(List<QuestionDTO> dtosList) {
        return dtosList.stream()
                .map(this::toEntity).collect(Collectors.toCollection(ArrayList::new));
    }

}
