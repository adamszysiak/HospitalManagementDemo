package com.szysi.spring.hospitalmanagement.service.doctorservice;

import com.szysi.spring.hospitalmanagement.dao.DoctorRepository;
import com.szysi.spring.hospitalmanagement.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements  DoctorService {
    private DoctorRepository doctorRepository;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor findById(int id) {
        Optional< Doctor > result = doctorRepository.findById(id);
        Doctor doctor;

        if(result.isPresent()){
            doctor = result.get();
        }
        else {
            throw  new RuntimeException("Did not find doctor id - "+ id);
        }
        return doctor;
    }

    @Override
    public void deleteById(int id) {
        doctorRepository.deleteById(id);
    }
}
