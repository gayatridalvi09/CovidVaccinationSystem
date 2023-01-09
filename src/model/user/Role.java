/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

/**
 *
 * @author gayat
 */
public enum Role {
    VACCINE_MANUFACTURER("Vaccine Manufacturer"),
    NURSE("Nurse"),
    MEDICAL_CENTER_ADMIN("Medical Center Admin"),
    RECEPTIONIST("Receptionist"),
    NGO_HEAD("Ngo Head"),
    PUBLIC_DONOR("Public Donor"),
    SYSTEM_ADMIN("System Admin"),
    COMMUNITY_ADMIN("Community Admin");
    
    private final String name;
    
    public String getName() {
        return name;
    }
    
    Role(String name) {
        this.name = name;
    }
}
