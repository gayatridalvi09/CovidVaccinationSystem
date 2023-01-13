/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.covidcharity;

/**
 *
 * @author gayat
 */
public class CovidCharity {
    private String NGO_name;
    private String Address;
    private String Employee;
    private String City;

    public CovidCharity(String NGO_name, String Address, String Employee, String City) {
        this.NGO_name = NGO_name;
        this.Address = Address;
        this.Employee = Employee;
        this.City = City;
    }

    public String getNGO_name() {
        return NGO_name;
    }

    public void setNGO_name(String NGO_name) {
        this.NGO_name = NGO_name;
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
