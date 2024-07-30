package org.example.hospitaldatadip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hospitaldatadip.entity.enums.PatientStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Patient extends BaseEntity {
    @OneToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private PatientStatus status;


}
