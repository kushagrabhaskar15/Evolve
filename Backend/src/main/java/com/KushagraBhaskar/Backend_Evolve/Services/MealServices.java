package com.KushagraBhaskar.Backend_Evolve.Services;

import com.KushagraBhaskar.Backend_Evolve.Dto.MealDto.MealInputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.MealDto.MealOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Entity.Meal;
import com.KushagraBhaskar.Backend_Evolve.Repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MealServices {

    private final MealRepository mealRepository;
    private final ModelMapper modelMapper;

    public List<MealOutputDto> getAllMeals() {
        List<Meal> mealsList = mealRepository.findAll();
        return   mealsList
                .stream()
                .map(meal -> modelMapper.map(meal,MealOutputDto.class))
                .toList();
    }

    public List<MealOutputDto> getAllMealsOfUser(Long userId) {
    }

    public MealOutputDto getMealById(Long mealId) {
        Meal meal = mealRepository.findById(mealId)
                .orElseThrow(()->new IllegalArgumentException("No Meal With the Entered Id!"));
        return   modelMapper.map(meal,MealOutputDto.class);
    }

    public List<MealOutputDto> getMealsByDay(LocalDate date) {
        List<Meal> mealsList = mealRepository.findAllByDate(date);
        return   mealsList
                .stream()
                .map(meal -> modelMapper.map(meal,MealOutputDto.class))
                .toList();
    }

    public MealOutputDto addMeal(MealInputDto meal) {
        Meal newMeal = modelMapper.map(meal,Meal.class);
        mealRepository.save(newMeal);
        return modelMapper.map(newMeal,MealOutputDto.class);
    }

    public void deleteMeal(Long mealId) {
        mealRepository.deleteById(mealId);
    }


    //THE FOLLOWING CODE(METHOD) MISSES THE POINT WHERE THE NUTRITION VALUES ARE CHANGED!!
    public MealOutputDto putMeal(Long mealId, MealInputDto meal) {
        Meal existingMeal = mealRepository.findById(mealId)
                .orElseThrow(()->new IllegalArgumentException("No Meal with such Id!"));
        existingMeal.setMealName(meal.getMealName());
        existingMeal.setMealType(meal.getMealType());
        existingMeal.setDate(meal.getDate());
        return modelMapper.map(existingMeal, MealOutputDto.class);
    }

    public MealOutputDto patchMeal(Long mealId, MealInputDto meal) {
    }
}
