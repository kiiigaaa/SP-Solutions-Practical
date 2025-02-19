package com.example.practical_test.controller;

import com.example.practical_test.model.News;
import com.example.practical_test.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/category/{name}")
    public List<News> getNewsByCategory(@PathVariable String name) {
        return newsService.getNewsByCategory(name);
    }

    @PostMapping
    public News createNews(@RequestBody News news) {
        return newsService.saveNews(news);
    }
}
