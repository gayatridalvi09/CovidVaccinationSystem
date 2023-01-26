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
public class MedicalCenter extends User {
    private List<VaccineRequest> vaccineRequests;
    private List<FundsRequest> fundsRequests;
    private List<Appointment> appointments;
    private EmployeeDirectory employeeDirectory;

    public MedicalCenter(String username, String password, String name, Role role) {
        super(username, password, name, role);
        this.employeeDirectory = new EmployeeDirectory(new ArrayList<>());
        this.vaccineRequests = new ArrayList<>();
        this.fundsRequests = new ArrayList<>();
        this.appointments = new ArrayList<>();
    } 

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public List<VaccineRequest> getVaccineRequests() {
        return vaccineRequests;
    }

    public void setVaccineRequests(List<VaccineRequest> vaccineRequests) {
        this.vaccineRequests = vaccineRequests;
    }
    
    public void addVaccineRequest(VaccineRequest vaccineRequest) {
        this.vaccineRequests.add(vaccineRequest);
    }

    public List<FundsRequest> getFundsRequests() {
        return fundsRequests;
    }

    public void setFundsRequests(List<FundsRequest> fundsRequests) {
        this.fundsRequests = fundsRequests;
    }
    
    public void addFundsRequest(FundsRequest fundsRequest) {
        this.fundsRequests.add(fundsRequest);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
    
    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }
}
