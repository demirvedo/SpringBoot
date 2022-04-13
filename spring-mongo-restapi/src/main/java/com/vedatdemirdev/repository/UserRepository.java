package com.vedatdemirdev.repository;

import com.vedatdemirdev.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}
