package org.cb.spring.repository;

import org.cb.spring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface IPublisherRepository extends CrudRepository<Publisher, Long> {
}
