package org.example.hospitaldatadip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hospitaldatadip.entity.enums.PatientStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "orders")
public class Admission extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private PatientStatus status;
    private LocalDateTime createdAt;
    private String description;
    private Double totalAmount;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    @OneToMany
    private List<Procedure> procedures;
}
