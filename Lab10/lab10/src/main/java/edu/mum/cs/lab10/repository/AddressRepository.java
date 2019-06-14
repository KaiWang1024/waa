package edu.mum.cs.lab10.repository;

import edu.mum.cs.lab10.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}
