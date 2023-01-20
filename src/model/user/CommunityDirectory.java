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
public class CommunityDirectory {
    private List<Community> communities;

    public CommunityDirectory(List<Community> communities) {
        this.communities = communities;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
    
    public void addCommunity(Community community) {
        this.communities.add(community);
    }

    
}
