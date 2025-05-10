package com.example.lab4_20220270.repository;

import com.example.lab4_20220270.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Integer> {
}