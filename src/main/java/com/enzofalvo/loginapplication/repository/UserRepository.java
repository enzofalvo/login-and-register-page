
package com.enzofalvo.loginapplication.repository;

import com.enzofalvo.loginapplication.model.User;
import java.util.Optional;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByName(String name);
    
}
