/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccinationsystem;

import java.util.ArrayList;
import java.util.List;
import model.user.VaccineManufacturer;

/**
 *
 * @author gayat
 */
public class CovidVaccinationSystem {
    private List<VaccineManufacturer> vaccineManufacturers;
    
    public CovidVaccinationSystem() {
        this.vaccineManufacturers = new ArrayList<>();
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
}
