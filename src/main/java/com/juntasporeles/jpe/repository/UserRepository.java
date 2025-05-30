package com.juntasporeles.jpe.repository;

import com.juntasporeles.jpe.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    
}
