package com.example.spring6webapp.service;

import com.example.spring6webapp.entity.Author;

public interface AuthorService {
    Iterable<Author> getAll();
}
