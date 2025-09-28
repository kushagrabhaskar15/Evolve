package com.KushagraBhaskar.Backend_Evolve.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Nutrition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nutritionId;
    private Long foodId;

    private Float calories;
    private Float protein;
    private Float fat;
    private Float carbs;
    private Float fiber;
    private Float sugar;


    @OneToOne
    @JoinColumn(name="food_id",
                nullable = false)
    private Meal meal;
}
