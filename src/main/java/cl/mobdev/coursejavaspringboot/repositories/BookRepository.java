package cl.mobdev.coursejavaspringboot.repositories;

import cl.mobdev.coursejavaspringboot.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
