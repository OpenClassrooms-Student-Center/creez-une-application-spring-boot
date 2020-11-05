package com.openclassrooms.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.models.User;

@Repository
@Qualifier("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {
	

}
