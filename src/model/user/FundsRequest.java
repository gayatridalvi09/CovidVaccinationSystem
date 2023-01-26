/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.user;

/**
 *
 * @author gayat
 */
public class FundsRequest extends WorkRequest {
    private String description;
    private int amount;
    private CovidCharity covidCharity;

    public FundsRequest(String description, int quantity, CovidCharity covidCharity) {
        super(WorkRequest.Status.PENDING);
        this.description = description;
        this.amount = quantity;
        this.covidCharity = covidCharity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CovidCharity getCovidCharity() {
        return covidCharity;
    }

    public void setCovidCharity(CovidCharity covidCharity) {
        this.covidCharity = covidCharity;
    }

    @Override
    public String toString() {
        return description;
    }
}
