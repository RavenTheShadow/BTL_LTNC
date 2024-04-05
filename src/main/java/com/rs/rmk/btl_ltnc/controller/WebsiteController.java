package com.rs.rmk.btl_ltnc.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebsiteController {
    @GetMapping("/")
    public String Home(HttpServletRequest request) {
        return "/Hospital_Home/Home";
    }
    @GetMapping("/login")
    public String login(HttpServletRequest request) {
        return "/Login_Page/index";
    }
    @GetMapping("/patient/list")
    public String PatientList(HttpServletRequest request) {
        return "Manage_Patient/List_Patient/index";
    }

    // Trang này sử dụng bootstrap tui ko biết sửa sao hết...
    @GetMapping("/patient/info")
    public String PatientInfo(HttpServletRequest request) {
        return "/Manage_Patient/Patient_Information/index";
    }

    @GetMapping("/medicine/form")
    public String MedicineForm(HttpServletRequest request) {
        return "/Manage_Medicine/medicineform";
    }
    @GetMapping("/medicine/info")
    public String MedicineInfo(HttpServletRequest request) {
        return "/Manage_Medicine/medicineinfo";
    }

    @GetMapping("/tool/form")
    public String ToolForm(HttpServletRequest request) {
        return "/Manage_Tool/devicesform";
    }
    @GetMapping("/tool/info")
    public String ToolInfo(HttpServletRequest request) {
        return "/Manage_Tool/deviceinfo";
    }

    @GetMapping("/schedule")
    public String Schedule(HttpServletRequest request) {
        return "/Schedule/index";
    }

    @GetMapping("/doctor/list")
    public String DoctorList(HttpServletRequest request) {
        return "/Manage_Doctor/Doctor_list/doctor";
    }

    // Trang này sử dụng bootstrap tui ko biết sửa sao hết...
    @GetMapping("/doctor/info")
    public String DoctorInfo(HttpServletRequest request) {
        return "/Manage_Doctor/Doctor_list/info";
    }


}
