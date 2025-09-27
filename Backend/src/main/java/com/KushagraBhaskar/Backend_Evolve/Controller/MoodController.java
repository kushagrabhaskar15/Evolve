package com.KushagraBhaskar.Backend_Evolve.Controller;

import com.KushagraBhaskar.Backend_Evolve.Dto.MoodDto.MoodInputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.MoodDto.MoodOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Services.MoodServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/mood")
@AllArgsConstructor
public class MoodController {
    private final MoodServices moodServices;

    @GetMapping
    ResponseEntity<List<MoodOutputDto>> getAllMoods(){
        return ResponseEntity.ok(moodServices.getAllMoods());
    }


    @GetMapping("/userId/{userId}")
    ResponseEntity<List<MoodOutputDto>> getMoodByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(moodServices.getMoodByUserId(userId));
    }

    @GetMapping("/moodId/{moodId}")
    ResponseEntity<MoodOutputDto> getMoodById(@PathVariable Long moodId){
        return ResponseEntity.ok(moodServices.getMoodById(moodId));
    }

    @GetMapping("/userId/{userId}/moodId/{moodId}")
    ResponseEntity<List<MoodOutputDto>> getMoodByUserIdAndMoodId(@PathVariable Long userId,
                                                                 @PathVariable Long moodId){
        return ResponseEntity.ok(moodServices.getMoodByUserIdAndMoodId(userId,moodId));
    }

    @GetMapping("/userId/{userId}/date/{date}")
    ResponseEntity<List<MoodOutputDto>> getMoodByUserIdAndMoodId(@PathVariable Long userId,
                                                                 @PathVariable LocalDate date){
        return ResponseEntity.ok(moodServices.getMoodByUserIdAndDate(userId,date));
    }

    @GetMapping("/date/{date}")
    ResponseEntity<List<MoodOutputDto>> getMoodByDate(@PathVariable LocalDate date){
        return ResponseEntity.ok(moodServices.getMoodByDate(date));
    }

    @PostMapping
    ResponseEntity<MoodOutputDto> addMood(@RequestBody MoodInputDto mood){
        return ResponseEntity.status(HttpStatus.CREATED).body(moodServices.addMood(mood));
    }

    @PutMapping("/id/{id}")
    ResponseEntity<MoodOutputDto> editMood(@PathVariable Long id,
                                           @RequestBody MoodInputDto mood){
        return ResponseEntity.status(HttpStatus.OK).body(moodServices.editMood(id,mood));
    }

    @PatchMapping("/id/{id}")
    ResponseEntity<MoodOutputDto> patchUser(@PathVariable Long id,
                                            @RequestBody Map<String,Object> updates){
        MoodOutputDto updated = moodServices.patchMood(id,updates);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/id/{id}")
    ResponseEntity<Void> deleteMood(@PathVariable Long id){
        moodServices.deleteMood(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
