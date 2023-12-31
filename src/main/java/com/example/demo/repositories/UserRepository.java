package com.example.demo.repositories;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// este annotation tb permitira a injeção de dep[endencia em outraas classes
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}