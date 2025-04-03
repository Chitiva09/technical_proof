package com.technical_test.technicalFiverr.service;

import com.technical_test.technicalFiverr.entities.UserEntity;
import com.technical_test.technicalFiverr.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override //Mostrar todos los usuarios
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override//buscar por email
    public UserEntity findByEmailUser(String email) {
        return null;
    }

    @Override//Guardar nuevo contacto
    public Boolean saveUser(UserEntity userEntity){
        if (userRepository.findByEmail(userEntity.getEmail())==null){
        userRepository.save(userEntity);
        return true;
        }
    return false;
    }
    @Override//Eliminar contacto
    public Boolean deleteByEmailUser(String email){
        if (userRepository.findByEmail(email)!=null){
          userRepository.deleteById(email);
          return true;
        }
        return false;
    }
    @Override
    public void updateByEmailUser(String email,UserEntity userEntity) {
        if (userRepository.findByEmail(userEntity.getEmail())!=null){
            userRepository.updateByEmail(email, userEntity);
        }
    }

}
