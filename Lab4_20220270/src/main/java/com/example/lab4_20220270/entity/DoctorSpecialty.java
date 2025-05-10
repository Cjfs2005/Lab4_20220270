package com.example.lab4_20220270.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctor_specialty")
public class DoctorSpecialty {

    @EmbeddedId
    private DoctorSpecialtyId id;

    @MapsId("doctorId")
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @MapsId("specialtyId")
    @ManyToOne
    @JoinColumn(name="specialty_id")
    private Specialty specialty;
}
