package org.cb.spring.repository;

import org.cb.spring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author, Long> {
}
