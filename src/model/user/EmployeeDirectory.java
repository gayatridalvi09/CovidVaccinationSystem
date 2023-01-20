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
public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
