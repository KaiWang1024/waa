package edu.mum.cs.lab10.repository;

import edu.mum.cs.lab10.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();
}
