/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.users;

import java.util.List;
import model.role.Role;
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

    public List<PublicDonor> getPublicDonors() {
        return publicDonors;
    }

    public void setPublicDonors(List<PublicDonor> publicDonors) {
        this.publicDonors = publicDonors;
    }
    
    
    public void addPublicDonors(PublicDonor publicDonor) {
        this.publicDonors.add(publicDonor);
    }
    
}
