package com.example.spring6webapp.service;

import com.example.spring6webapp.entity.Book;
import com.example.spring6webapp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> getAll() {
        return bookRepository.findAll();
    }
}
