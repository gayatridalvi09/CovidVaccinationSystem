/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.workrequest;

/**
 *
 * @author gayat
 */
public class WorkRequest {
    private Status status;
    
    public enum Status {
        PENDING, APPROVED, DENIED, VACCINATED;
    }
    
    public WorkRequest(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
