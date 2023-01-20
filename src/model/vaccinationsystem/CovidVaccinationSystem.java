/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccinationsystem;

import java.util.ArrayList;
import java.util.List;
import model.user.CommunityAdmin;
import model.user.CommunityAdminDirectory;
import model.user.CovidCharity;
import model.user.CovidCharityDirectory;
import model.user.MedicalCenter;
import model.user.MedicalCenterDirectory;
import model.user.VaccineManufacturer;
import model.user.VaccineManufacturerDirectory;

/**
 *
 * @author gayat
 */
public class CovidVaccinationSystem {
    private VaccineManufacturerDirectory vaccineManufacturerDirectory;    
    private MedicalCenterDirectory medicalCenterDirectory;
    private CovidCharityDirectory covidCharityDirectory;
    private CommunityAdminDirectory communityDirectory;



    
    public CovidVaccinationSystem() {
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
