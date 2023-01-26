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
public class PublicDonor extends User {
    private List<Donation> donations;

    public PublicDonor(String username, String password, String name,
            Role role, List<Donation>donations) {
        super(username, password, name, role);
        this.donations = donations;
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }
    
    public void addDonations(Donation donation) {
        this.donations.add(donation);
    }
    
}
