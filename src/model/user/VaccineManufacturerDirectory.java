/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.List;

/**
 *
 * @author gayat
 */
public class VaccineManufacturerDirectory {
    private List<VaccineManufacturer> vaccineManufacturers;

    public List<VaccineManufacturer> getVaccineManufacturers() {
        return vaccineManufacturers;
    }

    public void setVaccineManufacturers(List<VaccineManufacturer> vaccineManufacturers) {
        this.vaccineManufacturers = vaccineManufacturers;
    }

    public VaccineManufacturerDirectory(List<VaccineManufacturer> vaccineManufacturers) {
        this.vaccineManufacturers = vaccineManufacturers;
    }
    
    public void addVaccineManufacturer(VaccineManufacturer vaccineManufacturer) {
        this.vaccineManufacturers.add(vaccineManufacturer);
    }
    
    
}
