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
public class MedicalCenter extends User{
    private EmployeeDirectory employeeDirectory;

    public MedicalCenter(String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.employeeDirectory = new EmployeeDirectory(new ArrayList<>());
        
    } 

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
    
}
