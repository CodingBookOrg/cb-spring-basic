package org.cb.spring.controller;

import org.cb.spring.repository.IAuthorRepository;
import org.cb.spring.repository.IBookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final IAuthorRepository authorRepository;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }
}
