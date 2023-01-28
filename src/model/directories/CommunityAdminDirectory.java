/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import model.users.CityAdmin;
import java.util.List;

/**
 *
 * @author gayat
 */
public class CommunityAdminDirectory {
    private List<CityAdmin> communities;

    public CommunityAdminDirectory(List<CityAdmin> communities) {
        this.communities = communities;
    }

    public List<CityAdmin> getCommunities() {
        return communities;
    }

    public void setCommunities(List<CityAdmin> communities) {
        this.communities = communities;
    }
    
    public void addCommunity(CityAdmin community) {
        this.communities.add(community);
    }


    
}
