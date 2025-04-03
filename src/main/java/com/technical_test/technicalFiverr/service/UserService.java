package com.technical_test.technicalFiverr.service;

import com.technical_test.technicalFiverr.entities.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> findAllUsers();
    UserEntity findByEmailUser ( String email);
    Boolean saveUser(UserEntity userEntity);
    Boolean deleteByEmailUser(String email);
    void updateByEmailUser(String email, UserEntity userEntity);
}
