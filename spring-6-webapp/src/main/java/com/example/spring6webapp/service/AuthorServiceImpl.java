package com.example.spring6webapp.service;

import com.example.spring6webapp.entity.Author;
import com.example.spring6webapp.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> getAll() {
        return authorRepository.findAll();
    }
}
