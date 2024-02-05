package com.mjvquiz.service;

import com.mjvquiz.build.AlternativeMapper;
import com.mjvquiz.dto.AlternativeDTO;
import com.mjvquiz.model.Alternative;
import com.mjvquiz.repository.AlternativeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class AlternativeService {

    @Autowired
    private final AlternativeRepository alternativeRepository;
    @Autowired
    private final AlternativeMapper alternativeMapper;


    public AlternativeDTO save(Alternative alternative) {
        try {
            Alternative savedAlternative = alternativeRepository.save(alternative);
            return alternativeMapper.toDTO(savedAlternative);
        } catch (DataAccessException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, msgError("save"), e);
        }
    }

    private String msgError(String method){
        return "Ocorreu um erro em AlternativeService ao tentar fazer a operação no método: "  + method;
    }




}
