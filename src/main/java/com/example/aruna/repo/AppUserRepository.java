package com.example.aruna.repo;

import com.example.aruna.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findByUserName(String userName);
    Optional<AppUser> findAppUserByUserName(String userName);
}
