package com.szysi.spring.hospitalmanagement.dao;

import com.szysi.spring.hospitalmanagement.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
