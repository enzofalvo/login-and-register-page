
package com.enzofalvo.loginapplication.repository;

import com.enzofalvo.loginapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{
    
}
