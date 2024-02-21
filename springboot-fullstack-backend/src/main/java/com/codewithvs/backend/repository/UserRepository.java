package com.codewithvs.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithvs.backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
