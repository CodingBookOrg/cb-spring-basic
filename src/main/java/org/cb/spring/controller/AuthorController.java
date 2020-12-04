package org.cb.spring.controller;

import org.cb.anotherDomain.Student;
import org.cb.spring.repository.IAuthorRepository;
import org.cb.spring.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final IAuthorRepository authorRepository;

    @Autowired
    public Student student;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        System.out.println("************" + student.getId());
        return "authors/list";
    }
}
