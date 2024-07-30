package org.example.hospitaldatadip.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Administration extends BaseEntity {
    @OneToOne
    private User user;
    @OneToMany
    private List<DailyInformation> dailyInformationList;

}
