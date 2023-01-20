/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.List;
import model.covidcharity.Covidcharity;

/**
 *
 * @author gayat
 */
public class CovidCharity extends User{
    private List<Covidcharity> covidcharities;

    public CovidCharity(List<Covidcharity> covidcharities, String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.covidcharities = covidcharities;
    }


    public List<Covidcharity> getCovidcharities() {
        return covidcharities;
    }

    public void setCovidcharities(List<Covidcharity> covidcharities) {
        this.covidcharities = covidcharities;
    }

        public void addCovidCharity(Covidcharity covidCharity) {
        this.covidcharities.add(covidCharity);
    }

}
