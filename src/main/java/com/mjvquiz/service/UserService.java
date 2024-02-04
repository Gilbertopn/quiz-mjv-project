package com.mjvquiz.service;

import com.mjvquiz.dto.UserDTO;
import com.mjvquiz.model.User;
import com.mjvquiz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    public User save(User user){

        return userRepository.save(user);
    }
}
