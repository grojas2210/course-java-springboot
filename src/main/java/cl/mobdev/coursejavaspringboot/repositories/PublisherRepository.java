package cl.mobdev.coursejavaspringboot.repositories;

import cl.mobdev.coursejavaspringboot.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
