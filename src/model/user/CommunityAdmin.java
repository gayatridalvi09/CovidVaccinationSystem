/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gayat
 */
public class CommunityAdmin extends User{
    private CommunityDirectory communityDirectory;

    public CommunityAdmin(String username, String password, String name, Role role) {
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
