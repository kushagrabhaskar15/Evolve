package com.KushagraBhaskar.Backend_Evolve.Repository;

import com.KushagraBhaskar.Backend_Evolve.Entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByEmail(String email);

    List<User> findAllByMno(String mno);

    List<User> findAllByName(String name);

    List<User> findAllByUserName(String userName);
}
