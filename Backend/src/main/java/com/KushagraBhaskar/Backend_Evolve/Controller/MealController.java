package com.KushagraBhaskar.Backend_Evolve.Controller;

import com.KushagraBhaskar.Backend_Evolve.Dto.MealDto.MealInputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.MealDto.MealOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Services.MealServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/meal")
public class MealController {

    private final MealServices mealServices;

    @GetMapping
    ResponseEntity<List<MealOutputDto>> getAllMeals(){
        return ResponseEntity.ok(mealServices.getAllMeals());
    }

    @GetMapping("/userId/{userId}")
    ResponseEntity<List<MealOutputDto>> getAllMealsOfUser(@PathVariable Long userId){
        return ResponseEntity.ok(mealServices.getAllMealsOfUser(userId));
    }

    @GetMapping("/mealId/{mealId}")
    ResponseEntity<MealOutputDto> getMealById(@PathVariable Long mealId){
        return ResponseEntity.ok(mealServices.getMealById(mealId));
    }

    @GetMapping("/date/{date}")
    ResponseEntity<List<MealOutputDto>> getMealsByDay(@PathVariable LocalDate date){
        return ResponseEntity.ok(mealServices.getMealsByDay(date));
    }

    @PostMapping
    ResponseEntity<MealOutputDto> addMeal(@RequestBody MealInputDto meal){
        return ResponseEntity.ok(mealServices.addMeal(meal));
    }

    @DeleteMapping("/mealId/{mealId}")
    ResponseEntity<Void> deleteMeal(@PathVariable Long mealId){
        mealServices.deleteMeal(mealId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/mealId/{mealId}")
    ResponseEntity<MealOutputDto> putMeal(@PathVariable Long mealId,
                                           @RequestBody MealInputDto meal){
        return ResponseEntity.ok(mealServices.putMeal(mealId,meal));
    }

    @PatchMapping("/mealId/{mealId}")
    ResponseEntity<MealOutputDto> patchMeal(@PathVariable Long mealId,
                                          @RequestBody MealInputDto meal){
        return ResponseEntity.ok(mealServices.patchMeal(mealId,meal));
    }
}
