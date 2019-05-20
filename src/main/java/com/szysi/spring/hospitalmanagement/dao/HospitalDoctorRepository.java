package com.szysi.spring.hospitalmanagement.dao;

import com.szysi.spring.hospitalmanagement.entity.HospitalDoctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalDoctorRepository extends JpaRepository<HospitalDoctor,Integer> {
}
