package com.microservice.driver.persistence;

import com.microservice.driver.entities.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverRepository extends CrudRepository<Driver, Long> {
}
