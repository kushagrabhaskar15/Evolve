package com.KushagraBhaskar.Backend_Evolve.Controller;

import com.KushagraBhaskar.Backend_Evolve.Dto.UserDto.UserInputDto;
import com.KushagraBhaskar.Backend_Evolve.Dto.UserDto.UserOutputDto;
import com.KushagraBhaskar.Backend_Evolve.Services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserServices userServices;

    @GetMapping
    ResponseEntity<List<UserOutputDto>> getAllUsers(){
        return ResponseEntity.ok(userServices.getAllUsers());
    }

    @GetMapping("/id/{id}")
    ResponseEntity<UserOutputDto> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userServices.getUserById(id));
    }

    @GetMapping("/email/{email}")
    ResponseEntity<List<UserOutputDto>> getUserByEmail(@PathVariable String email){
        return ResponseEntity.ok(userServices.getUserByEmail(email));
    }

    @GetMapping("/mno/{mno}")
    ResponseEntity<List<UserOutputDto>> getUserByMobile(@PathVariable String mno){
        return ResponseEntity.ok(userServices.getUserByMobile(mno));
    }

    @GetMapping("/name/{name}")
    ResponseEntity<List<UserOutputDto>> getUserByName(@PathVariable String name){
        return ResponseEntity.ok(userServices.getUserByName(name));
    }

    @GetMapping("/user-name/{userName}")
    ResponseEntity<List<UserOutputDto>> getUserByUserName(@PathVariable String userName){
        return ResponseEntity.ok(userServices.getUserByUserName(userName));
    }

    @PostMapping
    ResponseEntity<UserOutputDto> addUser(@RequestBody UserInputDto user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userServices.addUser(user));
    }

    @PutMapping("/id/{id}")
    ResponseEntity<UserOutputDto> editUser(@PathVariable Long id,
                                          @RequestBody UserInputDto user){
        return ResponseEntity.status(HttpStatus.OK).body(userServices.editUser(id,user));
    }

    @PatchMapping("/id/{id}")
    ResponseEntity<UserOutputDto> patchUser(@PathVariable Long id,
                                            @RequestBody Map<String,Object> updates){
        UserOutputDto updated = userServices.patchUser(id,updates);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/id/{id}")
    ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userServices.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
