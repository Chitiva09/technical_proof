package com.technical_test.technicalFiverr.repositories;

import com.technical_test.technicalFiverr.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    List<UserEntity> findAll();
    UserEntity findByEmail(String email);
    UserEntity save(UserEntity userEntity);
    void deleteById(String email);
    void updateByEmail(String email, UserEntity userEntity);
}

