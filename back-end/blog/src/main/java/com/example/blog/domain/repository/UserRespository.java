package com.example.blog.domain.repository;

import com.example.blog.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRespository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    // 회원가입 로직
    boolean existsByUsername(String username);
    boolean existsByNickname(String username);
    boolean existsByEmail(String username);
}
