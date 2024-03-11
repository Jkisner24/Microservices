package com.microservice.user.microserviceuser.persistence;

import com.microservice.user.microserviceuser.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT s FROM User s WHERE s.driverId = :idDriver")
    List<User> findAllUser(Long idDriver);

    //List<User> findAllByDriverId(Long idDriver);
}
