package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.service.hospitalservice.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/showFormForUpdateHospital")
    public String showFormForUpdateHospital(@RequestParam("hospitalId") int id,Model model){
        Hospital hospital = hospitalService.findById(id);
        model.addAttribute("hospital" ,hospital);
        return "hospitals/hospital-form";
    }

    @GetMapping("/delete")
    public String deleteHospital(@RequestParam ("hospitalId") int id){
        hospitalService.deleteHospitalById(id);
        return "redirect:/hospitals/list";
    }

}
