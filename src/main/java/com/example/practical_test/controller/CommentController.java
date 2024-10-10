package com.example.practical_test.controller;

import com.example.practical_test.model.Comment;
import com.example.practical_test.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {


    @Autowired
    private CommentService commentService;

    @PostMapping("/news/{newsId}")
    public Comment addComment(@PathVariable Long newsId, @RequestBody Comment comment) {
        return commentService.saveComment(newsId, comment);
    }

    @GetMapping("/news/{newsId}")
    public List<Comment> getComments(@PathVariable Long newsId) {
        return commentService.getCommentsByNewsId(newsId);
    }
}
