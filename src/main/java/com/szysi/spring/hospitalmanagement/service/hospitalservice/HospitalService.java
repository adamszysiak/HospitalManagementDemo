package com.szysi.spring.hospitalmanagement.service.hospitalservice;

import com.szysi.spring.hospitalmanagement.entity.Hospital;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HospitalService {
    List<Hospital> findAll();

    void saveHospital(Hospital hospital);

    Hospital findById(int id);

    void deleteHospitalById(int id);
}
