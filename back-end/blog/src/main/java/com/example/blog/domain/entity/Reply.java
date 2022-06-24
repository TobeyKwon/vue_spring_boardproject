package com.example.blog.domain.entity;

import javax.persistence.*;

@Entity
public class Reply extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "reply_id")
    private Long id;

    @Lob
    @Column(nullable = false)
    private String comment; // 댓글 내용

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Board post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // 작성자
}
