package com.example.demo.Infrastructures.Repositories;

import com.example.demo.Infrastructures.Repositories.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByName(String name);
}
