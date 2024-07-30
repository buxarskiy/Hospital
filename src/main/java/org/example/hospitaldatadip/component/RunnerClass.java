package org.example.hospitaldatadip.component;

import lombok.RequiredArgsConstructor;
import org.example.hospitaldatadip.service.PatientService;
import org.example.hospitaldatadip.service.implement.DoctorServiceImplement;
import org.example.hospitaldatadip.service.implement.OrderServiceImplement;
import org.example.hospitaldatadip.service.implement.PatientServiceImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RunnerClass implements CommandLineRunner {

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;
    private PatientServiceImplement patientServiceImplement;
    private DoctorServiceImplement doctorServiceImplement;
    private OrderServiceImplement orderServiceImplement;

    @Override
    public void run(String... args) throws Exception {

    }
}
