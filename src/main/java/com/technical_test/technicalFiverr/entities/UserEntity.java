package com.technical_test.technicalFiverr.entities;

import com.technical_test.technicalFiverr.dtos.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity//Se usa para marcar una clase como una entidad que representa una tabla en la base de datos.
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String name;
    private String phone;
    private Boolean active = true;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "second_last_name")
    private String secondLastName;
    @Column(name = "lastAccess")
    private LocalDateTime lastAccess;
    @Column(name = "lastModified")
    private LocalDateTime lastModified;




    public UserDto toDto(){
        return new UserDto(email, name, lastName, secondLastName, phone, id, active, lastAccess, lastModified);
    }

}
