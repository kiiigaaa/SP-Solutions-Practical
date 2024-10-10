package com.example.practical_test.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

    @Entity
    public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToMany(mappedBy = "categories")
        private Set<News> news = new HashSet<>();

        // Getters and Setters
        public Set<News> getNews() {
            return news;
        }

        public void setNews(Set<News> news) {
            this.news = news;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

