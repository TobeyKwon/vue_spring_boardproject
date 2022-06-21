package com.example.blog.entity;

import javax.persistence.*;

@Entity
public class Reply extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Lob
    @Column(nullable = false)
    private String comment; // 댓글 내용

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // 작성자
}
