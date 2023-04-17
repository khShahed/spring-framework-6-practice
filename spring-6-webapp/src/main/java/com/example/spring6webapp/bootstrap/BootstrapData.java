package com.example.spring6webapp.bootstrap;

import com.example.spring6webapp.entity.Author;
import com.example.spring6webapp.entity.Book;
import com.example.spring6webapp.entity.Publisher;
import com.example.spring6webapp.repositories.AuthorRepository;
import com.example.spring6webapp.repositories.BookRepository;
import com.example.spring6webapp.repositories.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        var eric = Author.builder()
                .firstName("Eric")
                .lastName("Evans")
                .books(new HashSet<>())
                .build();

        var ddd = Book.builder()
                .title("Domain Driven Design")
                .isbn("12345")
                .build();

        var rod = Author.builder()
                .firstName("Rod")
                .lastName("Johnson")
                .books(new HashSet<>())
                .build();

        var noEJB = Book.builder()
                .title("J2EE Development without EJB")
                .isbn("2345")
                .build();

        eric = authorRepository.save(eric);
        rod = authorRepository.save(rod);

        ddd = bookRepository.save(ddd);
        noEJB = bookRepository.save(noEJB);

        eric.getBooks().add(ddd);
        rod.getBooks().add(noEJB);

        authorRepository.save(eric);
        authorRepository.save(rod);

        var publisher = Publisher.builder()
                .publisherName("Penguin")
                .address("abc street")
                .build();

        publisher = publisherRepository.save(publisher);

        ddd.setPublisher(publisher);
        noEJB.setPublisher(publisher);

        bookRepository.save(ddd);
        bookRepository.save(noEJB);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
