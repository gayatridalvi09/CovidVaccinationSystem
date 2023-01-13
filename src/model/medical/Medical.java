/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.medical;

/**
 *
 * @author gayat
 */
public class Medical {
    private String MedicalCareName;
    private String Address;
    private String Employee;
    private String City;

    public Medical(String MedicalCareName, String Address, String Employee, String City) {
        this.MedicalCareName = MedicalCareName;
        this.Address = Address;
        this.Employee = Employee;
        this.City = City;
    }

    public String getMedicalCareName() {
        return MedicalCareName;
    }

    public void setMedicalCareName(String MedicalCareName) {
        this.MedicalCareName = MedicalCareName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String Employee) {
        this.Employee = Employee;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    

    
}
