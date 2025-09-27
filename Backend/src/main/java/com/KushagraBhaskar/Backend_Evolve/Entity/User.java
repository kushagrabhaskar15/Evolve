package com.KushagraBhaskar.Backend_Evolve.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String name;
    private String bio;
    private Integer age;
    private Float weight;
    private Integer height;
    private Long mno;

    @Email
    private String email;

    @OneToMany(mappedBy = "user")
    List<Food> foods;
}
