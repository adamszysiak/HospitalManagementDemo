package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.service.hospitalservice.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hospitals")
public class HospitalController {

    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/list")
    public String getHospitals(Model model){
        List<Hospital> hospitalList = hospitalService.findAll();
        model.addAttribute("hospitals",hospitalList);
        return  "hospitals/hospitals-list";
    }

    @GetMapping("/showFormForAddHospital")
    public String showFormForAddHospital(Model model){
        Hospital hospital = new Hospital();

        model.addAttribute("hospital",hospital);
        return "hospitals/hospital-form";
    }

    @PostMapping("/save")
    public String saveHospital(@ModelAttribute ("hospital" ) Hospital hospital){

        hospitalService.saveHospital(hospital);

        return "redirect:/hospitals/list";
    }
}
