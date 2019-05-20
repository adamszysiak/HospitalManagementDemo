package com.szysi.spring.hospitalmanagement.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hospital_doctor")
public class HospitalDoctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hospital_id")
    private int hospitalId;
//    @ManyToOne
//    @JoinColumn(name = "hospital_id")
//    private Hospital hospital;

    @Column(name = "doctor_id")
    private int doctorId;
//    @ManyToOne
//    @JoinColumn(name = "doctor_id")
//    private Doctor doctor;

    @Column(name = "date_started")
    private Date dateStarted;

    @Column(name = "department")
    private String department;

    @Column(name = "position")
    private String position;

    @Column(name = "supervisor")
    private String supervisor;

    @Column(name = "status")
    private String status;

    @Column(name = "part_time")
    private boolean partTime;

    @Column(name = "home_consult")
    private boolean homeConsult;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;


    public HospitalDoctor() {
    }

    public HospitalDoctor(int hospitalId, int doctorId, Date dateStarted, String department, String position, String supervisor,
                          String status, boolean partTime, boolean homeConsult, String lastModifiedBy) {
        this.hospitalId = hospitalId;
        this.doctorId = doctorId;
        this.dateStarted = dateStarted;
        this.department = department;
        this.position = position;
        this.supervisor = supervisor;
        this.status = status;
        this.partTime = partTime;
        this.homeConsult = homeConsult;
        this.lastModifiedBy = lastModifiedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    public boolean isHomeConsult() {
        return homeConsult;
    }

    public void setHomeConsult(boolean homeConsult) {
        this.homeConsult = homeConsult;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public String toString() {
        return "HospitalDoctor{" +
                "id=" + id +
                ", hospitalId=" + hospitalId +
                ", doctorId=" + doctorId +
                ", dateStarted=" + dateStarted +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", status='" + status + '\'' +
                ", partTime=" + partTime +
                ", homeConsult=" + homeConsult +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                '}';
    }
}
