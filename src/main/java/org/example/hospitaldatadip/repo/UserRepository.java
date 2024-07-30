package org.example.hospitaldatadip.repo;

import org.example.hospitaldatadip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}