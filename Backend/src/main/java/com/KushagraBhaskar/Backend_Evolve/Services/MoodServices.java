package com.KushagraBhaskar.Backend_Evolve.Services;

import com.KushagraBhaskar.Backend_Evolve.Dto.MoodDto.MoodInputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.MoodDto.MoodOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.UserDto.UserOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Entity.Mood;
import com.KushagraBhaskar.Backend_Evolve.Repository.MoodRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class MoodServices {

    private final MoodRepository moodRepository;
    private final ModelMapper modelMapper;

    public List<MoodOutputDto> getAllMoods() {
        List<Mood> moodList = moodRepository.findAll();
        return   moodList
                .stream()
                .map(mood->modelMapper.map(mood, MoodOutputDto.class))
                .toList();
    }

    public List<MoodOutputDto> getMoodByUserId(Long userId) {
        List<Mood> moodList = moodRepository.findAllByUserId(userId);
        return   moodList
                .stream()
                .map(mood->modelMapper.map(mood, MoodOutputDto.class))
                .toList();
    }

    public MoodOutputDto getMoodById(Long moodId) {
        Mood mood = moodRepository.findById(moodId)
                .orElseThrow(()->new IllegalArgumentException("No Mood Logged with the entered Id!"));
        return modelMapper.map(mood, MoodOutputDto.class);
    }

    public List<MoodOutputDto> getMoodByUserIdAndMoodId(Long userId, Long moodId) {
        List<Mood> moodList = moodRepository.findAllByUserIdAndMoodId(userId, moodId);
        return   moodList
                .stream()
                .map(mood->modelMapper.map(mood, MoodOutputDto.class))
                .toList();
    }

    public List<MoodOutputDto> getMoodByUserIdAndDate(Long userId, LocalDate date) {
        List<Mood> moodList = moodRepository.findAllByUserIdAndDate(userId,date);
        return   moodList
                .stream()
                .map(mood->modelMapper.map(mood, MoodOutputDto.class))
                .toList();
    }

    public List<MoodOutputDto> getMoodByDate(LocalDate date) {
        List<Mood> moodList = moodRepository.findAllByDate(date);
        return   moodList
                .stream()
                .map(mood->modelMapper.map(mood, MoodOutputDto.class))
                .toList();
    }

    public MoodOutputDto addMood(MoodInputDto mood) {
        Mood newMood = modelMapper.map(mood, Mood.class);
        moodRepository.save(newMood);
        return modelMapper.map(newMood, MoodOutputDto.class);
    }

    public MoodOutputDto editMood(Long id, MoodInputDto mood) {
    }

    public MoodOutputDto patchMood(Long id, Map<String, Object> updates) {
    }

    public void deleteMood(Long id) {
        moodRepository.deleteById(id);
    }

}
