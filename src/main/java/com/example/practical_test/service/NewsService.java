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

    public List<News> findByCategory(Long categoryId) {
        return newsRepository.findByCategories_Id(categoryId);
    }

    public News findById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }

    public News save(News news) {
        return newsRepository.save(news);
    }

    public void delete(Long id) {
        newsRepository.deleteById(id);
    }
}
