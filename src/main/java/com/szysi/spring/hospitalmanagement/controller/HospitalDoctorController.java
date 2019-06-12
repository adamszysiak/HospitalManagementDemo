package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.entity.Doctor;
import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.entity.HospitalDoctor;
import com.szysi.spring.hospitalmanagement.service.doctorservice.DoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitaldoctorservice.HospitalDoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitalservice.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hospitalDoctor")
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
    public String getHospitalDoctor(Model model) {
        List<HospitalDoctor> hospitalDoctorList = hospitalDoctorService.findAll();
        model.addAttribute("hospitalDoctor", hospitalDoctorList);

        return "hospitaldoctor/hospital-doctor-list";
    }


    @GetMapping("/showFormForAdd")
    public String showFormForAddHospitalDoctor(
            @ModelAttribute("tempDoctor") Doctor doctor,
            @ModelAttribute("tempHospital") Hospital hospital, Model model) {

        HospitalDoctor hospitalDoctor = new HospitalDoctor();
        List<Doctor> doctorList = doctorService.findAll();
        List<Hospital> hospitalList = hospitalService.findAll();
        model.addAttribute("doctorList", doctorList);
        model.addAttribute("hospitalList", hospitalList);

        model.addAttribute("hospitalDoctor", hospitalDoctor);

        hospitalDoctor.setHospital(hospital);
        hospitalDoctor.setDoctor(doctor);

        return "hospitaldoctor/hospital-doctor-form";
    }

    @PostMapping("/save")
    public String saveHospitalDoctor(@ModelAttribute("hospitalDoctor") HospitalDoctor hospitalDoctor) {
        hospitalDoctorService.saveHospitalDoctor(hospitalDoctor);
        return "redirect:/hospitalDoctor/list";
    }

    @GetMapping("/showFormForUpdateHospitalDoctor")
    public String showFormForUpdateHospitalDoctor(@RequestParam("hospitalDoctorId") int id, Model model) {
        HospitalDoctor hospitalDoctor = hospitalDoctorService.findById(id);
        List<Doctor> doctorList = doctorService.findAll();
        List<Hospital> hospitalList = hospitalService.findAll();
        model.addAttribute("doctorList", doctorList);
        model.addAttribute("hospitalList", hospitalList);
        model.addAttribute("hospitalDoctor", hospitalDoctor);
        return "hospitaldoctor/hospital-doctor-form";
    }

    @GetMapping("/delete")
    public String deleteHospitalDoctor(@RequestParam("hospitalDoctorId") int id) {
        hospitalDoctorService.deleteHospitalDoctorById(id);
        return "redirect:/hospitalDoctor/list";
    }
}
