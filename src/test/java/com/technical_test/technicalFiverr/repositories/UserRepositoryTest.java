package com.technical_test.technicalFiverr.repositories;

import com.technical_test.technicalFiverr.entities.UserEntity;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Inject
    UserRepository userRepository;

    @Test
    void test() {
        userRepository.save(
                UserEntity.builder()
                        .name("name")
                        .lastName("lastName")
                        .secondLastName("secondLastName")
                        .email("email")
                        .phone(123)
                        .build()
        );

        userRepository.save(
                UserEntity.builder()
                        .name("name 1")
                        .lastName("lastName 1")
                        .secondLastName("secondLastName 1")
                        .email("email 1")
                        .phone(1231)
                        .build()
        );

        userRepository.save(
                UserEntity.builder()
                        .name("name 2")
                        .lastName("lastName 2")
                        .secondLastName("secondLastName 2")
                        .email("email 2")
                        .phone(1232)
                        .build()
        );

        List<UserEntity> all = userRepository.findAll();

        assertTrue(true);
    }

}