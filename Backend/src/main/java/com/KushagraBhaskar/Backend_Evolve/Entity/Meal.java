package com.KushagraBhaskar.Backend_Evolve.Entity;

import com.KushagraBhaskar.Backend_Evolve.UsedEnums.MealType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mealId;

    private Long userId;
    private String mealName;
    private MealType mealType;
    private String Nutrition;
    private String calories;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id",
                nullable = false)
    private User user;

    @OneToOne(mappedBy = "meal")
    private Nutrition nutrition;
}
