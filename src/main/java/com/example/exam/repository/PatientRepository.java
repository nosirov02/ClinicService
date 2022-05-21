package com.example.exam.repository;

import com.example.exam.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Integer>, JpaSpecificationExecutor<Patient> {
    Optional<Patient> findByIdAndDeletedAtIsNull(Integer id);
}
