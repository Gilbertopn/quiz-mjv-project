package com.mjvquiz.controller;

import com.mjvquiz.dto.AlternativeDTO;
import com.mjvquiz.model.Alternative;
import com.mjvquiz.service.AlternativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alternatives")
public class AlternativeController {

    @Autowired
    private AlternativeService alternativeService;

    @PostMapping("save")
    public AlternativeDTO save(@RequestBody Alternative alternative){
        return alternativeService.save(alternative);
    }
}
