package com.example.blog.domain.repository;

import com.example.blog.domain.entity.Reply;
import com.example.blog.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    @Query("select r from Reply r join fetch r.post p where p.id = :postId")
    List<Reply> findReplyByPostId(@Param("postId") Long postId);
}
