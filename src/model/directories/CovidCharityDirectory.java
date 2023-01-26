/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import model.users.CovidCharity;
import java.util.List;

/**
 *
 * @author gayat
 */
public class CovidCharityDirectory {
    private List<CovidCharity> covidCharities;

    public CovidCharityDirectory(List<CovidCharity> covidCharities) {
        this.covidCharities = covidCharities;
    }

    public List<CovidCharity> getCovidCharities() {
        return covidCharities;
    }

    public void setCovidCharities(List<CovidCharity> covidCharities) {
        this.covidCharities = covidCharities;
    }
    
    public void addCovidCharity(CovidCharity covidCharity) {
        this.covidCharities.add(covidCharity);
    }
}
