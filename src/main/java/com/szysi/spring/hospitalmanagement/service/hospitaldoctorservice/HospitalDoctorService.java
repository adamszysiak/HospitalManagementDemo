package com.szysi.spring.hospitalmanagement.service.hospitaldoctorservice;

import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.entity.HospitalDoctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HospitalDoctorService {

    List<HospitalDoctor> findAll();

    void saveHospitalDoctor(HospitalDoctor hospitalDoctor);
}
