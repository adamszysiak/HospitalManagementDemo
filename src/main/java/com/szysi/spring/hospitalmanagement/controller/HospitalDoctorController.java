package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.dao.HospitalDoctorRepository;
import com.szysi.spring.hospitalmanagement.entity.Doctor;
import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.entity.HospitalDoctor;
import com.szysi.spring.hospitalmanagement.service.doctorservice.DoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitaldoctorservice.HospitalDoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitalservice.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hospitaldoctor")
public class HospitalDoctorController {

    private HospitalDoctorService hospitalDoctorService;
    private HospitalService hospitalService;
    private DoctorService doctorService;

    public HospitalDoctorController(HospitalDoctorService hospitalDoctorService, HospitalService hospitalService, DoctorService doctorService) {
        this.hospitalDoctorService = hospitalDoctorService;
        this.hospitalService = hospitalService;
        this.doctorService = doctorService;
    }

    //
//    public HospitalDoctorController(HospitalDoctorService hospitalDoctorService, HospitalService hospitalService) {
//        this.hospitalDoctorService = hospitalDoctorService;
//        this.hospitalService = hospitalService;
//    }

//    public HospitalDoctorController(HospitalDoctorService hospitalDoctorService) {
//        this.hospitalDoctorService = hospitalDoctorService;
//    }

//    public HospitalDoctorController() {
//    }

    @GetMapping("/list")
    public String getHospitalDoctor(Model model){
        List<HospitalDoctor> hospitalDoctorList = hospitalDoctorService.findAll();
        model.addAttribute("hospitaldoctor", hospitalDoctorList);

        return "hospitaldoctor/hospital-doctor-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAddHospitalDoctor(Model model){
        HospitalDoctor hospitalDoctor = new HospitalDoctor();
        model.addAttribute("hospitaldoctor", hospitalDoctor);
//        Doctor doctor = doctorService.findById(id);
//
//        Hospital hospital = hospitalService.findById(id);
//        model.addAttribute("hospital", hospital);
        List<Doctor> doctorList = doctorService.findAll();
        List<Hospital> hospitalList = hospitalService.findAll();
//        for(Doctor tempDoctor:doctorList)
//        {
//            nameDoctor= tempDoctor.getName();
//        }
//        model.addAttribute("subjects", subjects);
        model.addAttribute("doctor",doctorList);
        model.addAttribute("hospital",hospitalList);
//        hospitalDoctor.setDoctorId(doctor.getId());
        return "hospitaldoctor/hospital-doctor-form";
    }

    @PostMapping("/save")
    public String saveHospitalDoctor(@ModelAttribute ("hospitaldoctor") HospitalDoctor hospitalDoctor){
//        try {
            hospitalDoctorService.saveHospitalDoctor(hospitalDoctor);
//        }
//        catch (Exception e){
//            System.err.println(e.toString());
//        }
        return "redirect:/hospitaldoctor/hospital-doctor-list";
    }
}
