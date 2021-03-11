
package com.enzofalvo.loginapplication.service;

import com.enzofalvo.loginapplication.model.User;


public interface UserService {
    User save(User user);
    
    boolean findByName(String name);
}
