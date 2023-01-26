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
public class CovidCharity extends User {
    private List<PublicDonor> publicDonors;

    public CovidCharity(List<PublicDonor> publicDonors, String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.publicDonors = publicDonors;
    }
}
