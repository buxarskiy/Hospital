package org.example.hospitaldatadip.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Doctor extends BaseEntity {
    @ManyToOne
    private Room room;
    @ManyToMany
    private List<Speciality> speciality;
    @OneToMany
    private List<Attachment> files;
    @OneToOne
    private User user;
    @OneToMany
    private List<DailyInformation> dailyInformationList;


}
