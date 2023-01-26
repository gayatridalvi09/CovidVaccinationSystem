/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

import model.users.VaccineManufacturer;

/**
 *
 * @author gayat
 */
public class VaccineRequest extends WorkRequest {
    private String description;
    private int quantity;
    private VaccineManufacturer vaccineManufacturer;

    public VaccineRequest(String description, int quantity, VaccineManufacturer vaccineManufacturer) {
        super(WorkRequest.Status.PENDING);
        this.description = description;
        this.quantity = quantity;
        this.vaccineManufacturer = vaccineManufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public VaccineManufacturer getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(VaccineManufacturer vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }
    
    @Override
    public String toString() {
        return description;
    }
    
    
}
