/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.List;

/**
 *
 * @author gayat
 */
public class CovidCharity extends User{
    private List<CovidCharity> covidcharities;

    public CovidCharity(List<CovidCharity> covidcharities, String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.covidcharities = covidcharities;
    }


    public List<CovidCharity> getCovidcharities() {
        return covidcharities;
    }

    public void setCovidcharities(List<CovidCharity> covidcharities) {
        this.covidcharities = covidcharities;
    }

        public void addCovidCharity(CovidCharity covidCharity) {
        this.covidcharities.add(covidCharity);
    }

}
