package cl.mobdev.coursejavaspringboot.repositories;

import cl.mobdev.coursejavaspringboot.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
