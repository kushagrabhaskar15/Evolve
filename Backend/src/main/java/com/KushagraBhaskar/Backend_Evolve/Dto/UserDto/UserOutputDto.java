package com.KushagraBhaskar.Backend_Evolve.Dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserOutputDto {

    private Long id;
    private String userName;
    private String Name;
    private String bio;
    private Integer age;
    private Float weight;
    private Integer height;
    private Long mno;
    private String email;
}
