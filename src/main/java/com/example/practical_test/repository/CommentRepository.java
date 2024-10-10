package com.example.practical_test.repository;

import com.example.practical_test.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNews_Id(Long newsId);
}
