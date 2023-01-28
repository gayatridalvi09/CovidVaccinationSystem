/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.users;

import java.util.ArrayList;
import java.util.List;
import model.directories.CommunityDirectory;
import model.role.Role;

/**
 *
 * @author gayat
 */
public class CityAdmin extends User{
    private CommunityDirectory communityDirectory;

    public CityAdmin(String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.communityDirectory = new CommunityDirectory(new ArrayList<>());
    }

    public CommunityDirectory getcommunityDirectory() {
        return communityDirectory;
    }

    public void setcommunityDirectory(CommunityDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
}
