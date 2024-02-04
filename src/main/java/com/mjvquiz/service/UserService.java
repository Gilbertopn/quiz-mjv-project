package com.mjvquiz.service;

import com.mjvquiz.build.UserMapper;
import com.mjvquiz.dto.UserDTO;
import com.mjvquiz.model.User;
import com.mjvquiz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;



    @Transactional
    public UserDTO save(UserDTO userDTO){

        return userMapper.toDTO(userRepository.save(userMapper.toEntity(userDTO)));
    }
    @Transactional
    public User findById(Long id){
        return userRepository.findById(id).orElseThrow();
    }
    @Transactional
    public List<UserDTO> findAll(){
        return userMapper.toListDTO(userRepository.findAll());
    }

}
