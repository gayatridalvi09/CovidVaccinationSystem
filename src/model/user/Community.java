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
public class Community extends User{
        private List<Community> community;

    public Community(List<Community> community, String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.community = community;
    }

    public List<Community> getCommunity() {
        return community;
    }

    public void setCommunity(List<Community> community) {
        this.community = community;
    }
    public void addCommunity(Community community) {
        this.community.add(community);
    }

}
