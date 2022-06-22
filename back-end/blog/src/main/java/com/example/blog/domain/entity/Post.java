package com.example.blog.domain.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String writer;

    private int view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @OrderBy("id asc")
    private List<Reply> comments = new ArrayList<>();
}
