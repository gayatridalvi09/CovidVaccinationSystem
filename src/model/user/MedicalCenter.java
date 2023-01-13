/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.List;
import model.medical.Medical;

/**
 *
 * @author gayat
 */
public class MedicalCenter extends User{
        private List<Medical> medicalCenter;

    public MedicalCenter(List<Medical> medicalCenter, String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.medicalCenter = medicalCenter;
    }

    public List<Medical> getMedicalCenter() {
        return medicalCenter;
    }

    public void setMedicalCenter(List<Medical> medicalCenter) {
        this.medicalCenter = medicalCenter;
    }

    
    
    
    
}
