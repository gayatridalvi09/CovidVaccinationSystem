/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.directories;

import model.users.CommunityAdmin;
import java.util.List;

/**
 *
 * @author gayat
 */
public class CommunityAdminDirectory {
    private List<CommunityAdmin> communities;

    public CommunityAdminDirectory(List<CommunityAdmin> communities) {
        this.communities = communities;
    }

    public List<CommunityAdmin> getCommunities() {
        return communities;
    }

    public void setCommunities(List<CommunityAdmin> communities) {
        this.communities = communities;
    }
    
    public void addCommunity(CommunityAdmin community) {
        this.communities.add(community);
    }


    
}
