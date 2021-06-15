package cl.mobdev.coursejavaspringboot.data.repositories;

import cl.mobdev.coursejavaspringboot.application.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
