package org.cb.spring.bootstrap;

import org.cb.spring.domain.Author;
import org.cb.spring.domain.Book;
import org.cb.spring.domain.Publisher;
import org.cb.spring.repository.IAuthorRepository;
import org.cb.spring.repository.IBookRepository;
import org.cb.spring.repository.IPublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;
    private final IPublisherRepository publisherRepository;

    public BootstrapData(IAuthorRepository authorRepository, IBookRepository bookRepository, IPublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author("Eric", "Evans");
        Book b1 = new Book("Domain Driven Design", "1111");
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);


        authorRepository.save(a1);
        bookRepository.save(b1);

        Author a2 = new Author("Jason", "Bourne");
        Book b2 = new Book("My Diaries", "1111");
        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        authorRepository.save(a2);
        bookRepository.save(b2);

        Publisher publisher = new Publisher("McGraw", "USA");
        publisher.getBooks().add(b1);
        b1.setPublisher(publisher);
        publisher.getBooks().add(b2);
        b2.setPublisher(publisher);

        publisherRepository.save(publisher);
        bookRepository.save(b1);
        bookRepository.save(b2);

        System.out.println(publisherRepository.findById(1L));
    }
}
