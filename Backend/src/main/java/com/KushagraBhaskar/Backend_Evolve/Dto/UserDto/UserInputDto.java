package com.KushagraBhaskar.Backend_Evolve.Dto.UserDto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInputDto {
    private String userName;
    private String name;
    private String bio;
    private Integer age;
    private Float weight;
    private Integer height;
    private Long mno;
    private String email;
}
