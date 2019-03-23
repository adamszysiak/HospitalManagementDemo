package com.szysi.spring.hospitalmanagement.service.doctorservice;

import com.szysi.spring.hospitalmanagement.entity.Doctor;

import java.util.List;

public interface DoctorService {
    void saveDoctor(Doctor doctor);

    List<Doctor> findAll();

    Doctor findById(int id);

    void deleteById(int id);
}
