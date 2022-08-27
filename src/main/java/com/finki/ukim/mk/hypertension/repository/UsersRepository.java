package com.finki.ukim.mk.hypertension.repository;

import com.finki.ukim.mk.hypertension.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Integer> {

    @Query(value="select * from users where user_username=?",nativeQuery = true)
    Optional<Users> findByUsername(String user_username);

}
