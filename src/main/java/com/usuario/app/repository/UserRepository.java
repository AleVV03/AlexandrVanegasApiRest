package com.usuario.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usuario.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
