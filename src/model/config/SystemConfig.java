/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.config;

import model.vaccinationsystem.CovidVaccinationSystem;

/**
 *
 * @author gayat
 */
public class SystemConfig {
    
    public static CovidVaccinationSystem configure(){
        
        CovidVaccinationSystem covidVaccinationSystem = CovidVaccinationSystem.getInstance();
        
        System.out.println("CovidVaccination ");
        System.out.println(covidVaccinationSystem);
        
        return covidVaccinationSystem;
    }
    
}
