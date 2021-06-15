package cl.mobdev.coursejavaspringboot.data.repositories;

import cl.mobdev.coursejavaspringboot.application.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
