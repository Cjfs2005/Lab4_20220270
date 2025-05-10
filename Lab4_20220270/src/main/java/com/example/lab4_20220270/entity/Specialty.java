package com.example.lab4_20220270.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.nimbus.State;
import java.time.LocalDate;

@Entity
@Table(name = "specialty")
@Getter
@Setter
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String code;
}
