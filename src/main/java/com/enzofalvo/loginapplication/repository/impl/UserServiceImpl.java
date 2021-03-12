package com.enzofalvo.loginapplication.repository.impl;

import com.enzofalvo.loginapplication.model.User;
import com.enzofalvo.loginapplication.repository.UserRepository;
import com.enzofalvo.loginapplication.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean findByName(String name) {
        Optional<User> obj = userRepository.findByName(name);

        return obj.isPresent();
    }

    @Override
    public boolean findByNameAndPassword(String name, String password) {
        Optional<User> obj = userRepository.findByNameAndPassword(name, password);
        
        return obj.isPresent();
    }
}
