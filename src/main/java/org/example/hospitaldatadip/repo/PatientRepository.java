package org.example.hospitaldatadip.repo;

import org.example.hospitaldatadip.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {
}