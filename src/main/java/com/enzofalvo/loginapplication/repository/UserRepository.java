
package com.enzofalvo.loginapplication.repository;

import com.enzofalvo.loginapplication.model.User;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{

}
