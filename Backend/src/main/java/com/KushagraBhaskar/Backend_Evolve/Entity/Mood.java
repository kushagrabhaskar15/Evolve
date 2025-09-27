package com.KushagraBhaskar.Backend_Evolve.Entity;

import com.KushagraBhaskar.Backend_Evolve.UsedEnums.CurrentMood;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moodId;
    private Long userId;
    private CurrentMood mood;
    private String desc;
    private Integer intensity;
    private LocalDateTime logDateTime;

    @ManyToOne
    @JoinColumn(name="user_id",
                nullable = false)
    private User user;
}
