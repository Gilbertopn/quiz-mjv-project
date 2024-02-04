package com.mjvquiz.service;

import com.mjvquiz.dto.UserDTO;
import com.mjvquiz.model.User;
import com.mjvquiz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public User save(User user){

        return userRepository.save(user);
    }
}
