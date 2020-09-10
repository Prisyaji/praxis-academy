package com.project.aji.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.aji.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}