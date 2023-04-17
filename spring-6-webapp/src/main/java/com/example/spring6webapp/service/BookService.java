package com.example.spring6webapp.service;

import com.example.spring6webapp.entity.Book;

public interface BookService {
    Iterable<Book> getAll();
}
