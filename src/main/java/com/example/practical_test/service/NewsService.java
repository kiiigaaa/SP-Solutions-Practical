package com.example.practical_test.service;

import com.example.practical_test.model.News;
import com.example.practical_test.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    public List<News> getNewsByCategory(String categoryName) {
        return newsRepository.findByCategoriesName(categoryName);
    }

}
