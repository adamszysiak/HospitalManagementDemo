package com.szysi.spring.hospitalmanagement.dao;

import com.szysi.spring.hospitalmanagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    List<Doctor> findAllByOrderBySurnameAsc();
}
