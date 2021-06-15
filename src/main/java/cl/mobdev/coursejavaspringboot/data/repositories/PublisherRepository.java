package cl.mobdev.coursejavaspringboot.data.repositories;

import cl.mobdev.coursejavaspringboot.application.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
