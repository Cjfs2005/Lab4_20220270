package com.example.lab4_20220270.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.nimbus.State;
import java.time.LocalDate;

@Entity
@Table(name = "doctor")
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String full_name;

    private String dni;

    private String phone_number;

    private String email;

    private LocalDate incorporationDate;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private DoctorState doctorState;
}
