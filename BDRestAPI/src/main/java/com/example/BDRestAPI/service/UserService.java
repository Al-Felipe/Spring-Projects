package com.example.BDRestAPI.service;

import com.example.BDRestAPI.model.UserEntity;
import com.example.BDRestAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> obterTodos(){return userRepository.findAll();}

    public UserEntity obterPorId(String id){return userRepository.findById(id).orElse(null);}

    public UserEntity inserir(UserEntity user) {return userRepository.save(user);}

    public UserEntity atualizar(String id, UserEntity newUser){
        UserEntity existingUser = userRepository.findById(id).orElse(null);

        if(existingUser != null){
            existingUser.setEmail(newUser.getNome());
            existingUser.setEmail(newUser.getEmail());
            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void excluir(String id){
        userRepository.deleteById(id);
    }
}
