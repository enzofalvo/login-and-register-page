
package com.enzofalvo.loginapplication.repository.impl;

import com.enzofalvo.loginapplication.model.User;
import com.enzofalvo.loginapplication.repository.UserRepository;
import com.enzofalvo.loginapplication.service.UserService;
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
}
