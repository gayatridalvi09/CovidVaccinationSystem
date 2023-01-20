/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.List;
import model.vaccine.Vaccine;

/**
 *
 * @author gayat
 */
public class VaccineDirectory {
     private List<Vaccine> vaccines;

    public VaccineDirectory(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
    
    public void addVaccine(Vaccine vaccine) {
        this.vaccines.add(vaccine);
    }
}
