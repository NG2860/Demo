package org.pts.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.pts.demo.model.Users;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Users findByEmail(String email);
}
