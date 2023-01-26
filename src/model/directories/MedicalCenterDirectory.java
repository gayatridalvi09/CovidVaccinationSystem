/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import model.users.MedicalCenter;
import java.util.List;

/**
 *
 * @author gayat
 */
public class MedicalCenterDirectory {
    private List<MedicalCenter> medicalCenters;

    public MedicalCenterDirectory(List<MedicalCenter> medicalCenters) {
        this.medicalCenters = medicalCenters;
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
    
}
