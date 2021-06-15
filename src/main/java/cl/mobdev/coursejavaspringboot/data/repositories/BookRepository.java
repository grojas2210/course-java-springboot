package cl.mobdev.coursejavaspringboot.data.repositories;

import cl.mobdev.coursejavaspringboot.application.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
