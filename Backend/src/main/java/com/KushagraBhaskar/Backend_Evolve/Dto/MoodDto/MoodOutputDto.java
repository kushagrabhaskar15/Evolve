package com.KushagraBhaskar.Backend_Evolve.Dto.MoodDto;

import com.KushagraBhaskar.Backend_Evolve.Entity.User;
import com.KushagraBhaskar.Backend_Evolve.UsedEnums.CurrentMood;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class MoodOutputDto {
    private Long moodId;
    private Long userId;
    private CurrentMood mood;
    private String desc;
    private Integer intensity;
    private LocalDateTime logDateTime;
    private User user;
}
