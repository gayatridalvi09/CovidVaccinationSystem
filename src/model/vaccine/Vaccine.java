/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vaccine;

/**
 *
 * @author gayat
 */
public class Vaccine {
    private String brand;
    private int quantity;
    private String disbursementCity;

    public Vaccine(String brand, int quantity, String disbursementCity) {
        this.brand = brand;
        this.quantity = quantity;
        this.disbursementCity = disbursementCity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDisbursementCity() {
        return disbursementCity;
    }

    public void setDisbursementCity(String disbursementCity) {
        this.disbursementCity = disbursementCity;
    }
    
    @Override
    public String toString() {
        return brand;
    }
    
}
