package com.mjvquiz.controller;

import com.mjvquiz.build.UserMapper;
import com.mjvquiz.dto.UserDTO;
import com.mjvquiz.model.User;
import com.mjvquiz.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;


    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
        UserDTO userDTO1 = userService.save(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id){
        User user = userService.findById(id);
        UserDTO userDTO = userMapper.toDTO(user);
        return ResponseEntity.ok(userDTO);

    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll(){
        List<UserDTO> userDTO = userService.findAll();
        return ResponseEntity.ok(userDTO);
    }




}
