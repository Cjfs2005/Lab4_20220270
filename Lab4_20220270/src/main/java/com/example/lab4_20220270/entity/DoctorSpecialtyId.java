package com.example.lab4_20220270.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DoctorSpecialtyId implements Serializable {
    @Column(name="doctor_id",nullable = false)
    private int doctorId;

    @Column(name="specialty_id",nullable = false)
    private int specialtyId;

    public int getDoctorId() {return doctorId;}
    public void setDoctorId(int doctorId) {this.doctorId = doctorId;}
    public int getSpecialtyId() {return specialtyId;}
    public void setSpecialtyId(int specialtyId) {this.specialtyId = specialtyId;}
}
