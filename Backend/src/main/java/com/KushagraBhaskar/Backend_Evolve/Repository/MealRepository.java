package com.KushagraBhaskar.Backend_Evolve.Repository;

import com.KushagraBhaskar.Backend_Evolve.Dto.MealDto.MealOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal,Long> {
    List<Meal> findAllByDate(LocalDate date);
}
