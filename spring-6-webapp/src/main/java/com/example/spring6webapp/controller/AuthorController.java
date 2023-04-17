package com.example.spring6webapp.controller;

import com.example.spring6webapp.entity.Author;
import com.example.spring6webapp.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authors")
@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Author> getAll() {
        return authorService.getAll();
    }
}
