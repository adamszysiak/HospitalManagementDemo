package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.entity.Doctor;
import com.szysi.spring.hospitalmanagement.service.doctorservice.DoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitaldoctorservice.HospitalDoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitalservice.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    private HospitalDoctorService hospitalDoctorService;
    private HospitalService hospitalService;
    private DoctorService doctorService;

    public DoctorController(HospitalDoctorService hospitalDoctorService, HospitalService hospitalService, DoctorService doctorService) {
        this.hospitalDoctorService = hospitalDoctorService;
        this.hospitalService = hospitalService;
        this.doctorService = doctorService;
    }

//    private DoctorService doctorService;
//
//    public DoctorController(DoctorService doctorService) {
//        this.doctorService = doctorService;
//    }

    @GetMapping("/list")
    public String getDoctors(Model model) {
        List<Doctor> doctorList = doctorService.findAll();
        model.addAttribute("doctor",doctorList);
        return "doctor/doctor-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAddDoctor(Model model){
        Doctor doctor = new Doctor();
        model.addAttribute("doctor",doctor);
        return "doctor/doctor-form" ;
    }
    @PostMapping("/save")
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor){
        doctorService.saveDoctor(doctor);
        // use a redirect to prevent duplicate submissions
        return "redirect:/doctor/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("doctorId") int id, Model model){
        Doctor doctor = doctorService.findById(id);

        model.addAttribute("doctor",doctor);

        return "doctor/doctor-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam ("doctorId") int id){

        doctorService.deleteById(id);

        return "redirect:/doctor/list";
    }
}
