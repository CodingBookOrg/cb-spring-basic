package org.cb.spring.bootstrap;

import org.cb.spring.domain.Author;
import org.cb.spring.domain.Book;
import org.cb.spring.repository.IAuthorRepository;
import org.cb.spring.repository.IBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;

    public BootstrapData(IAuthorRepository authorRepository, IBookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1111");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);


        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author a2 = new Author("Jason", "Bourne");
        Book b2 = new Book("My Diaries", "1111");
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        System.out.println("Number of books 1: " + bookRepository.count());

        authorRepository.save(a2);
        bookRepository.save(b2);
        System.out.println("Number of books 1: " + bookRepository.count());

    }
}
