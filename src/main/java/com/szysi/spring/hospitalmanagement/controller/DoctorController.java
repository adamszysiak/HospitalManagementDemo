package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.entity.Doctor;
import com.szysi.spring.hospitalmanagement.service.doctorservice.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/list")
    public String getDoctors(Model model) {
        List<Doctor> doctorList = doctorService.findAll();
        model.addAttribute("doctors",doctorList);
        return "doctors/doctors-list";
    }

    @GetMapping("/showFormForAddDoctor")
    public String showFormForAddDoctor(Model model){
        Doctor doctor = new Doctor();
        model.addAttribute("doctor",doctor);
        return "doctors/doctor-form" ;
    }
    @PostMapping("/save")
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor){
        doctorService.saveDoctor(doctor);
        // use a redirect to prevent duplicate submissions
        return "redirect:/doctors/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("doctorId") int id, Model model){
        Doctor doctor = doctorService.findById(id);

        model.addAttribute("doctor",doctor);

        return "doctors/doctor-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam ("doctorId") int id){

        doctorService.deleteById(id);

        return "redirect:/doctors/list";
    }
}
