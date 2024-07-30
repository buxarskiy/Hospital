package org.example.hospitaldatadip.repo;

import org.example.hospitaldatadip.entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Admission, UUID> {
}