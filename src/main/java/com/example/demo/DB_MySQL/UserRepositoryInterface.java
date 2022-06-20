package com.example.demo.DB_MySQL;

import org.springframework.data.repository.CrudRepository;

public interface UserRepositoryInterface extends CrudRepository< UserModel, Integer> {
    // This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
}