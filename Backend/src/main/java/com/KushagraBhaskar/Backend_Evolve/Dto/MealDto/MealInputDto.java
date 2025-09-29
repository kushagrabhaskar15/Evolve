package com.KushagraBhaskar.Backend_Evolve.Dto.MealDto;


import com.KushagraBhaskar.Backend_Evolve.Entity.Nutrition;
import com.KushagraBhaskar.Backend_Evolve.Entity.User;
import com.KushagraBhaskar.Backend_Evolve.UsedEnums.MealType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class MealInputDto {
    private String mealName;
    private MealType mealType;
    private LocalDate date;
}
