/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

/**
 *
 * @author gayat
 */
public class Appointment extends WorkRequest {
    private String name;
    private int age;
    private String phone;
    private String gender;
    private String address;
    private String emailId;
    private Employee nurse;
    private String vaccineBrand;
    private Employee receptionist;

    public Appointment(String name, int age, String phone, String gender, String address, String emailId, Employee nurse, String vaccineBrand, Employee receptionist) {
        super(WorkRequest.Status.PENDING);
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.emailId = emailId;
        this.nurse = nurse;
        this.vaccineBrand = vaccineBrand;
        this.receptionist = receptionist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Employee getNurse() {
        return nurse;
    }

    public void setNurse(Employee nurse) {
        this.nurse = nurse;
    }

    public String getVaccineBrand() {
        return vaccineBrand;
    }

    public void setVaccineBrand(String vaccineBrand) {
        this.vaccineBrand = vaccineBrand;
    }

    public Employee getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Employee receptionist) {
        this.receptionist = receptionist;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
