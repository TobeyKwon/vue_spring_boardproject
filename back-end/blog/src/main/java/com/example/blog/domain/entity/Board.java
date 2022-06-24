package com.example.blog.domain.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Board extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "board_id")
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

    /**
     * 조회수 증가
     */
    public void increaseView() {
        view++;
    }

    /**
     * 조회수 감소
     */
    public void decreaseView() {
        view = view != 0 ? view-- : 0;
    }

}
