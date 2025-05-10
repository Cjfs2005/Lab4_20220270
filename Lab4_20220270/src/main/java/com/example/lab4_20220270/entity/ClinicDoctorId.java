package com.example.lab4_20220270.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ClinicDoctorId implements Serializable {
    @Column(name="doctor_id",nullable = false)
    private int doctorId;

    @Column(name="clinic_id",nullable = false)
    private int clinicId;

    public int getDoctorId() {return doctorId;}
    public void setDoctorId(int doctorId) {this.doctorId = doctorId;}
    public int getClinicId() {return clinicId;}
    public void setClinicId(int clinicId) {this.clinicId = clinicId;}
}
