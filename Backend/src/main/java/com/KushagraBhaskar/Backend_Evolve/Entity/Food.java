package com.KushagraBhaskar.Backend_Evolve.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;

    private Long userId;
    private String foodName;

    @ManyToOne
    @JoinColumn(name = "user_id",
                nullable = false)
    private User user;
}
