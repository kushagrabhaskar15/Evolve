package com.KushagraBhaskar.Backend_Evolve.Repository;

import com.KushagraBhaskar.Backend_Evolve.Entity.Mood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MoodRepository extends JpaRepository<Mood,Long> {
    List<Mood> findAllByUserId(Long userId);

    List<Mood> findAllByUserIdAndMoodId(Long userId, Long moodId);

    List<Mood> findAllByUserIdAndDate(Long userId, LocalDate date);

    List<Mood> findAllByDate(LocalDate date);
}
