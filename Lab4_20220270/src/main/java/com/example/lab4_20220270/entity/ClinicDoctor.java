package com.example.lab4_20220270.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clinic_doctor")
public class ClinicDoctor {
    @EmbeddedId
    private ClinicDoctorId id;

    @MapsId("doctorId")
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @MapsId("clinicId")
    @ManyToOne
    @JoinColumn(name="clinic_id")
    private Clinic clinic;
}
