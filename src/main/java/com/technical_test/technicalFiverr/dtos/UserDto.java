package com.technical_test.technicalFiverr.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String email;
    private String name;
    private String lastName;
    private String secondLastName;
    private String phone;
    private long id;
    private Boolean active = true;
    private LocalDateTime lastAccess;
    private LocalDateTime lastModified;
}
