package org.example.hospitaldatadip.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private Integer age;
    private String phone;
    private String email;
    private String password;
    @OneToOne
    private Attachment image;
    @ManyToMany
    private List<Role> roles;

}
