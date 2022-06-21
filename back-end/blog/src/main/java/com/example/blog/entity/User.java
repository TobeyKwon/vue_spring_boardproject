package com.example.blog.entity;

import javax.persistence.*;

@Entity
public class User extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, updatable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
}
