package cl.mobdev.coursejavaspringboot.repositories;

import cl.mobdev.coursejavaspringboot.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
