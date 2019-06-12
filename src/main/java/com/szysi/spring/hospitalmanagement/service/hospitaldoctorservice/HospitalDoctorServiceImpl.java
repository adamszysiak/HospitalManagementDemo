package com.szysi.spring.hospitalmanagement.service.hospitaldoctorservice;

import com.szysi.spring.hospitalmanagement.dao.DoctorRepository;
import com.szysi.spring.hospitalmanagement.dao.HospitalDoctorRepository;
import com.szysi.spring.hospitalmanagement.dao.HospitalRepository;
import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.entity.HospitalDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalDoctorServiceImpl implements HospitalDoctorService {
    private HospitalDoctorRepository hospitalDoctorRepository;
    private HospitalRepository hospitalRepository;
    private DoctorRepository doctorRepository;

    @Autowired
    public HospitalDoctorServiceImpl(HospitalDoctorRepository hospitalDoctorRepository, HospitalRepository hospitalRepository, DoctorRepository doctorRepository) {
        this.hospitalDoctorRepository = hospitalDoctorRepository;
        this.hospitalRepository = hospitalRepository;
        this.doctorRepository = doctorRepository;
    }

//    @Autowired
//    public HospitalDoctorServiceImpl(HospitalDoctorRepository hospitalDoctorRepository) {
//        this.hospitalDoctorRepository = hospitalDoctorRepository;
//    }

    @Override
    public List<HospitalDoctor> findAll() {
        return hospitalDoctorRepository.findAll();
    }


    @Override
    public void saveHospitalDoctor(HospitalDoctor hospitalDoctor) {
        hospitalDoctorRepository.save(hospitalDoctor);
    }

    @Override
    public HospitalDoctor findById(int id) {
        Optional<HospitalDoctor> result =  hospitalDoctorRepository.findById(id);
        HospitalDoctor hospitalDoctor;
        if(result.isPresent()){
            hospitalDoctor = result.get();
        }
        else{
            throw  new RuntimeException("Did not found hospitalDoctor id - "+ id);
        }
        return hospitalDoctor;
    }

    @Override
    public void deleteHospitalDoctorById(int id) {
        hospitalDoctorRepository.deleteById(id);
    }
}
