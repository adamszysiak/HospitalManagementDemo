package com.szysi.spring.hospitalmanagement.controller;

import com.szysi.spring.hospitalmanagement.entity.Hospital;
import com.szysi.spring.hospitalmanagement.service.doctorservice.DoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitaldoctorservice.HospitalDoctorService;
import com.szysi.spring.hospitalmanagement.service.hospitalservice.HospitalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

    private HospitalDoctorService hospitalDoctorService;
    private HospitalService hospitalService;
    private DoctorService doctorService;

    public HospitalController(HospitalDoctorService hospitalDoctorService, HospitalService hospitalService, DoctorService doctorService) {
        this.hospitalDoctorService = hospitalDoctorService;
        this.hospitalService = hospitalService;
        this.doctorService = doctorService;
    }

    //
//    private HospitalService hospitalService;
//
//    public HospitalController(HospitalService hospitalService) {
//        this.hospitalService = hospitalService;
//    }

    @GetMapping("/list")
    public String getHospitals(Model model){
        List<Hospital> hospitalList = hospitalService.findAll();
        model.addAttribute("hospital",hospitalList);
        return "hospital/hospital-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAddHospital(Model model){
        Hospital hospital = new Hospital();

        model.addAttribute("hospital",hospital);
        return "hospital/hospital-form";
    }

    @PostMapping("/save")
    public String saveHospital(@ModelAttribute ("hospital" ) Hospital hospital){

        hospitalService.saveHospital(hospital);

        return "redirect:/hospital/list";
    }

    @GetMapping("/showFormForUpdateHospital")
    public String showFormForUpdateHospital(@RequestParam("hospitalId") int id,Model model){
        Hospital hospital = hospitalService.findById(id);
        model.addAttribute("hospital" ,hospital);
        return "hospital/hospital-form";
    }

    @GetMapping("/delete")
    public String deleteHospital(@RequestParam ("hospitalId") int id){
        hospitalService.deleteHospitalById(id);
        return "redirect:/hospital/list";
    }

}
