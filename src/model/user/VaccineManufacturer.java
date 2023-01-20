/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.ArrayList;
import java.util.List;
import model.vaccine.Vaccine;

/**
 *
 * @author gayat
 */
public class VaccineManufacturer extends User {
    private VaccineDirectory vaccineDirectory;

    public VaccineManufacturer(String username, 
            String password, String name, Role role) {
        super(username, password, name, role);
        this.vaccineDirectory = new VaccineDirectory(new ArrayList<>());
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    
    
}
