package com.example.practical_test.controller;

import com.example.practical_test.model.News;
import com.example.practical_test.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {
    @Autowired
    private NewsService newsService;


    @GetMapping("/category/{categoryId}")
    public List<News> getNewsByCategory(@PathVariable Long categoryId) {
        return newsService.findByCategory(categoryId);
    }

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable Long id) {
        return newsService.findById(id);
    }

    @PostMapping
    public News createNews(@RequestBody News news) {
        return newsService.save(news);
    }

    @PutMapping("/{id}")
    public News updateNews(@PathVariable Long id, @RequestBody News news) {
        news.setId(id);
        return newsService.save(news);
    }

    @DeleteMapping("/{id}")
    public void deleteNews(@PathVariable Long id) {
        newsService.delete(id);
    }
}
