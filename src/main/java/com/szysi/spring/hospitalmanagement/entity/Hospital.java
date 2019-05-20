package com.szysi.spring.hospitalmanagement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "town")
    private String town;

    @Column(name = "street")
    private String street;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone_number_1")
    private String phoneNumber1;

    @Column(name = "phone_number_2")
    private String phoneNumber2;

    @Column(name = "fax_number_1")
    private String faxNumber1;

    @Column(name = "fax_number_2")
    private String faxNumber2;

    @Column(name = "chief_of_medicine")
    private String chiefOfMedicine;

    @Column(name = "sales_rep")
    private String salesRep;

    @Column(name = "gps_address")
    private String gpsAddress;

    @Column(name = "helicopter_access")
    private boolean helicopterAccess;

    @Column(name = "teaching_hospital")
    private boolean teachingHospital;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "hospital_doctor",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "hospital_id")
    )
    private List<Doctor> doctors;

    public Hospital() {
    }

    public Hospital(String name, String country, String town, String street, String streetNumber, String postalCode, String phoneNumber1,
                    String phoneNumber2, String faxNumber1, String faxNumber2, String chiefOfMedicine, String salesRep, String gpsAddress,
                    boolean helicopterAccess, boolean teachingHospital, List<Doctor> doctors) {
        this.name = name;
        this.country = country;
        this.town = town;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.faxNumber1 = faxNumber1;
        this.faxNumber2 = faxNumber2;
        this.chiefOfMedicine = chiefOfMedicine;
        this.salesRep = salesRep;
        this.gpsAddress = gpsAddress;
        this.helicopterAccess = helicopterAccess;
        this.teachingHospital = teachingHospital;
        this.doctors = doctors;
    }

    public Hospital(int id, String name, String country, String town, String street, String streetNumber, String postalCode,
                    String phoneNumber1, String phoneNumber2, String faxNumber1, String faxNumber2, String chiefOfMedicine,
                    String salesRep, String gpsAddress, boolean helicopterAccess, boolean teachingHospital) {
        this.id=id;
        this.name = name;
        this.country = country;
        this.town = town;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.faxNumber1 = faxNumber1;
        this.faxNumber2 = faxNumber2;
        this.chiefOfMedicine = chiefOfMedicine;
        this.salesRep = salesRep;
        this.gpsAddress = gpsAddress;
        this.helicopterAccess = helicopterAccess;
        this.teachingHospital = teachingHospital;
    }

    public Hospital(String name, String country, String town, String street, String streetNumber, String postalCode,
                    String phoneNumber1, String phoneNumber2, String faxNumber1, String faxNumber2, String chiefOfMedicine,
                    String salesRep, String gpsAddress, boolean helicopterAccess, boolean teachingHospital) {
        this.name = name;
        this.country = country;
        this.town = town;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.faxNumber1 = faxNumber1;
        this.faxNumber2 = faxNumber2;
        this.chiefOfMedicine = chiefOfMedicine;
        this.salesRep = salesRep;
        this.gpsAddress = gpsAddress;
        this.helicopterAccess = helicopterAccess;
        this.teachingHospital = teachingHospital;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getFaxNumber1() {
        return faxNumber1;
    }

    public void setFaxNumber1(String faxNumber1) {
        this.faxNumber1 = faxNumber1;
    }

    public String getFaxNumber2() {
        return faxNumber2;
    }

    public void setFaxNumber2(String faxNumber2) {
        this.faxNumber2 = faxNumber2;
    }

    public String getChiefOfMedicine() {
        return chiefOfMedicine;
    }

    public void setChiefOfMedicine(String chiefOfMedicine) {
        this.chiefOfMedicine = chiefOfMedicine;
    }

    public String getSalesRep() {
        return salesRep;
    }

    public void setSalesRep(String salesRep) {
        this.salesRep = salesRep;
    }

    public String getGpsAddress() {
        return gpsAddress;
    }

    public void setGpsAddress(String gpsAddress) {
        this.gpsAddress = gpsAddress;
    }

    public boolean isHelicopterAccess() {
        return helicopterAccess;
    }

    public void setHelicopterAccess(boolean helicopterAccess) {
        this.helicopterAccess = helicopterAccess;
    }

    public boolean isTeachingHospital() {
        return teachingHospital;
    }

    public void setTeachingHospital(boolean teachingHospital) {
        this.teachingHospital = teachingHospital;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phoneNumber1='" + phoneNumber1 + '\'' +
                ", phoneNumber2='" + phoneNumber2 + '\'' +
                ", faxNumber1='" + faxNumber1 + '\'' +
                ", faxNumber2='" + faxNumber2 + '\'' +
                ", chiefOfMedicine='" + chiefOfMedicine + '\'' +
                ", salesRep='" + salesRep + '\'' +
                ", gpsAddress='" + gpsAddress + '\'' +
                ", helicopterAccess=" + helicopterAccess +
                ", teachingHospital=" + teachingHospital +
                ", doctors=" + doctors +
                '}';
    }
}

