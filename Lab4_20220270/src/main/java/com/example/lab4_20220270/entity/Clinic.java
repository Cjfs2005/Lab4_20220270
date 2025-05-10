package com.example.lab4_20220270.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.nimbus.State;
import java.time.LocalDate;

@Entity
@Table(name = "clinic")
@Getter
@Setter
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre de la clínica es obligatorio")
    @Size(min = 5, max = 100, message = "El nombre debe tener entre 5 y 100 caracteres")
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "La dirección es obligatoria")
    @Size(min = 10, message = "La dirección debe tener al menos 10 caracteres")
    @Column(name = "address", nullable = false)
    private String address;

    @NotBlank(message = "El número de teléfono es obligatorio")
    @Column(name = "phone_number", nullable = false, length = 9)
    private String phoneNumber;
}
