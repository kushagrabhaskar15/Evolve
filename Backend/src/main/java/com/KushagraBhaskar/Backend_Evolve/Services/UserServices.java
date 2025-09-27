package com.KushagraBhaskar.Backend_Evolve.Services;

import com.KushagraBhaskar.Backend_Evolve.Dto.UserDto.UserInputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.UserDto.UserOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Entity.User;
import com.KushagraBhaskar.Backend_Evolve.Repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class UserServices {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public List<UserOutputDto> getAllUsers() {
        List<User> userLists = userRepository.findAll();
        return userLists
                .stream()
                .map(user -> modelMapper.map(user,UserOutputDto.class))
                .toList();
    }

    public UserOutputDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("User Does Not Exist!"));
        return modelMapper.map(user,UserOutputDto.class);
    }

    public List<UserOutputDto> getUserByEmail(String email) {
        List<User> userLists = userRepository.findAllByEmail(email);
        return userLists
                .stream()
                .map(user -> modelMapper.map(user,UserOutputDto.class))
                .toList();
    }

    public List<UserOutputDto> getUserByMobile(String mno) {
        List<User> userLists = userRepository.findAllByMno(mno);
        return userLists
                .stream()
                .map(user -> modelMapper.map(user,UserOutputDto.class))
                .toList();
    }

    public List<UserOutputDto> getUserByName(String name) {
        List<User> userLists = userRepository.findAllByName(name);
        return userLists
                .stream()
                .map(user -> modelMapper.map(user,UserOutputDto.class))
                .toList();
    }

    public List<UserOutputDto> getUserByUserName(String userName) {
        List<User> userLists = userRepository.findAllByUserName(userName);
        return userLists
                .stream()
                .map(user -> modelMapper.map(user,UserOutputDto.class))
                .toList();
    }

    public UserOutputDto addUser(UserInputDto user) {
        User newUser = modelMapper.map(user,User.class);
        userRepository.save(newUser);
        return modelMapper.map(newUser,UserOutputDto.class);

    }

    public UserOutputDto editUser(Long id, UserInputDto user) {
        User existingUser = modelMapper.map(user,User.class);
        existingUser.setUserName(user.getUserName());
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setHeight(user.getHeight());
        existingUser.setWeight(user.getWeight());
        existingUser.setMno(user.getMno());
        existingUser.setEmail(user.getEmail());
        return modelMapper.map(existingUser,UserOutputDto.class);
    }

    // Re-Check the method Bellow
    public UserOutputDto patchUser(Long id, Map<String,Object> updates) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));

        if (updates.containsKey("name")) {
            user.setName((String) updates.get("name"));
        }
        if (updates.containsKey("userName")) {
            user.setUserName((String) updates.get("userName"));
        }
        if (updates.containsKey("age")) {
            Number ageNumber = (Number) updates.get("age");
            user.setAge(ageNumber == null ? null : ageNumber.intValue());
        }
        if (updates.containsKey("email")) {
            user.setEmail((String) updates.get("email"));
        }
        if (updates.containsKey("bio")) {
            user.setBio((String) updates.get("bio"));
        }
        if (updates.containsKey("mno")) {
            user.setMno((Long) updates.get("mno"));
        }
        if (updates.containsKey("height")) {
            user.setHeight((Integer) updates.get("height"));
        }
        if (updates.containsKey("weight")) {
            user.setWeight((Float) updates.get("weight"));
        }
        User saved = userRepository.save(user);
        return modelMapper.map(saved, UserOutputDto.class);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
