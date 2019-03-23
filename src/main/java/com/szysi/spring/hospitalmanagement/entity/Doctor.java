package com.szysi.spring.hospitalmanagement.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "title")
    private String title;

    @Column(name = "licence_number")
    private int licenceNumber;

    @Column(name = "position")
    private String position;

    @Column(name = "department")
    private String department;

    @Column(name = "supervisor")
    private String supervisor;

    @Column(name = "work_phone")
    private String workPhone;

    @Column(name = "private_phone")
    private String privatePhone;

    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "town")
    private String town;

    @Column(name = "street")
    private String street;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "available_date")
    private Date availableDate;

    @Column(name = "status")
    private String status;

    @Column(name = "part_time")
    private boolean partTime;

    @Column(name = "home_consult")
    private boolean homeConsult;

    public Doctor() {
    }

    public Doctor(String name, String surname, String title, int licenceNumber, String position, String department,
                  String supervisor, String workPhone, String privatePhone, String email, String country, String town,
                  String street, String streetNumber, String houseNumber, String postalCode, boolean availability,
                  Date availableDate, String status, boolean partTime, boolean homeConsult) {
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.licenceNumber = licenceNumber;
        this.position = position;
        this.department = department;
        this.supervisor = supervisor;
        this.workPhone = workPhone;
        this.privatePhone = privatePhone;
        this.email = email;
        this.country = country;
        this.town = town;
        this.street = street;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.availability = availability;
        this.availableDate = availableDate;
        this.status = status;
        this.partTime = partTime;
        this.homeConsult = homeConsult;
    }

    public Doctor(int id, String name, String surname, String title, int licenceNumber, String position, String department,
                  String supervisor, String workPhone, String privatePhone, String email, String country, String town,
                  String street, String streetNumber, String houseNumber, String postalCode, boolean availability,
                  Date availableDate, String status, boolean partTime, boolean homeConsult) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.licenceNumber = licenceNumber;
        this.position = position;
        this.department=department;
        this.supervisor = supervisor;
        this.workPhone = workPhone;
        this.privatePhone = privatePhone;
        this.email = email;
        this.country = country;
        this.town = town;
        this.street = street;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.availability = availability;
        this.availableDate = availableDate;
        this.status = status;
        this.partTime = partTime;
        this.homeConsult = homeConsult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
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

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", privatePhone='" + privatePhone + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", availability=" + availability +
                ", availableDate=" + availableDate +
                ", status='" + status + '\'' +
                ", partTime=" + partTime +
                ", homeConsult=" + homeConsult +
                '}';
    }
}
