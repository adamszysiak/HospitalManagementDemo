package com.szysi.spring.hospitalmanagement.service.hospitalservice;

import com.szysi.spring.hospitalmanagement.dao.HospitalRepository;
import com.szysi.spring.hospitalmanagement.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {

    private HospitalRepository hospitalRepository;

    @Autowired
    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }

    @Override
    public void saveHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

    @Override
    public Hospital findById(int id) {
        Optional<Hospital> result = hospitalRepository.findById(id);

        Hospital hospital;
        if (result.isPresent()) {
            hospital = result.get();
        } else {
            throw new RuntimeException("Did not found hospital with id: " + id);
        }
        return  hospital;
    }

    @Override
    public void deleteHospitalById(int id) {
        hospitalRepository.deleteById(id);
    }
}
