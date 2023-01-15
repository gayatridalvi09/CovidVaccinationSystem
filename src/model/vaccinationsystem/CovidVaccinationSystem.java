/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccinationsystem;

import java.util.ArrayList;
import java.util.List;
import model.user.Community;
import model.user.CovidCharity;
import model.user.MedicalCenter;
import model.user.VaccineManufacturer;

/**
 *
 * @author gayat
 */
public class CovidVaccinationSystem {
    private List<VaccineManufacturer> vaccineManufacturers;    
    private List<MedicalCenter> medicalCenters;
    private List<CovidCharity> covidCharities;
    private List<Community> community;



    
    public CovidVaccinationSystem() {
        this.vaccineManufacturers = new ArrayList<>();
        this.medicalCenters = new ArrayList<>();
        this.covidCharities = new ArrayList<>();
        this.community = new ArrayList<>();

    }

    public List<VaccineManufacturer> getVaccineManufacturers() {
        return vaccineManufacturers;
    }

    public void setVaccineManufacturers(List<VaccineManufacturer> vaccineManufacturers) {
        this.vaccineManufacturers = vaccineManufacturers;
    }
    
    public void addVaccineManufacturer(VaccineManufacturer vaccineManufacturer) {
        this.vaccineManufacturers.add(vaccineManufacturer);
    }
        public List<MedicalCenter> getMedicalCenters() {
        return medicalCenters;
    }

    public void setMedicalCenters(List<MedicalCenter> medicalCenters) {
        this.medicalCenters = medicalCenters;
    }


    public void addMedicalCenter(MedicalCenter medicalCenter) {
        this.medicalCenters.add(medicalCenter);
    }   
    public List<CovidCharity> getCovidCharities() {
        return covidCharities;
    }

    public void setCovidCharities(List<CovidCharity> covidCharities) {
        this.covidCharities = covidCharities;
    }
    public void addCovidCharity(CovidCharity covidCharity) {
        this.covidCharities.add(covidCharity);
    }
    public List<Community> getCommunity() {
        return community;
    }

    public void setCommunity(List<Community> community) {
        this.community = community;
    }
    public void addCommunity(Community community) {
        this.community.add(community);
    }


}
