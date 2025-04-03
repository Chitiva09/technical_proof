package com.technical_test.technicalFiverr.entities;

import com.technical_test.technicalFiverr.dtos.UserDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity//Se usa para marcar una clase como una entidad que representa una tabla en la base de datos.
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    private String email;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "second_last_name")
    private String secondLastName;
    private int phone;


    public UserDto toDto(){
        return new UserDto(email, name, lastName, secondLastName, phone);
    }

}
