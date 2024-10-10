package com.example.practical_test.service;

import com.example.practical_test.model.Comment;
import com.example.practical_test.model.News;
import com.example.practical_test.repository.CommentRepository;
import com.example.practical_test.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private NewsRepository newsRepository;

    public Comment saveComment(Long newsId, Comment comment) {
        News news = newsRepository.findById(newsId)
                .orElseThrow(() -> new RuntimeException("News not found"));
        comment.setNews(news);
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByNewsId(Long newsId) {
        return commentRepository.findByNewsId(newsId);
    }
}
