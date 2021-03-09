
package com.enzofalvo.loginapplication.service;

import com.enzofalvo.loginapplication.model.User;


public interface UserService {
    //AQUI VAO MEUS METODOS PARA A APLICAÇAO
    User save(User user);
    
    boolean findByName(String name);
}
