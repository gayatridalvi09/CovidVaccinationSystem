/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccinationsystem;

import java.util.ArrayList;
import java.util.List;
import model.users.CommunityAdmin;
import model.directories.CommunityAdminDirectory;
import model.users.CovidCharity;
import model.directories.CovidCharityDirectory;
import model.users.MedicalCenter;
import model.directories.MedicalCenterDirectory;
import model.users.VaccineManufacturer;
import model.directories.VaccineManufacturerDirectory;

/**
 *
 * @author gayat
 */
public class CovidVaccinationSystem {
    private static CovidVaccinationSystem covidVaccinationSystem;
    
    public static CovidVaccinationSystem getInstance(){
        if(covidVaccinationSystem == null){
            covidVaccinationSystem = new CovidVaccinationSystem();
        }
        return covidVaccinationSystem;
    }
    
    private VaccineManufacturerDirectory vaccineManufacturerDirectory;    
    private MedicalCenterDirectory medicalCenterDirectory;
    private CovidCharityDirectory covidCharityDirectory;
    private CommunityAdminDirectory communityDirectory;



    
    private CovidVaccinationSystem() {
        this.vaccineManufacturerDirectory = new VaccineManufacturerDirectory(new ArrayList<>());
        this.medicalCenterDirectory = new MedicalCenterDirectory(new ArrayList<>());
        this.covidCharityDirectory = new CovidCharityDirectory(new ArrayList<>());
        this.communityDirectory = new CommunityAdminDirectory(new ArrayList<>());

    }

    public VaccineManufacturerDirectory getVaccineManufacturerDirectory() {
        return vaccineManufacturerDirectory;
    }

    public void setVaccineManufacturerDirectory(VaccineManufacturerDirectory vaccineManufacturerDirectory) {
        this.vaccineManufacturerDirectory = vaccineManufacturerDirectory;
    }
    
    public MedicalCenterDirectory getMedicalCenterDirectory() {
        return medicalCenterDirectory;
    }

    public void setMedicalCenterDirectory(MedicalCenterDirectory medicalCenterDirectory) {
        this.medicalCenterDirectory = medicalCenterDirectory;
    }

    public CovidCharityDirectory getCovidCharityDirectory() {
        return covidCharityDirectory;
    }

    public void setCovidCharityDirectory(CovidCharityDirectory covidCharityDirectory) {
        this.covidCharityDirectory = covidCharityDirectory;
    }
    
    public CommunityAdminDirectory getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(CommunityAdminDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
}
