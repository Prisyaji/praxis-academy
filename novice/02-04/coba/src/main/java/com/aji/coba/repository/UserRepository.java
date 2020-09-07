package com.aji.coba.repository;

import org.springframework.data.repository.CrudRepository;

import com.aji.coba.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}