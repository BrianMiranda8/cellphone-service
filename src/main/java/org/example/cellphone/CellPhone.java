package org.example.cellphone;

import org.example.user.User;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private User owner;


    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, User owner){
        this.carrier = carrier;
        this.serialNumber = serialNumber;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.owner = owner;
    }

    public CellPhone(){
        this(-1, "locked", "open", "xxx-xxx-xxxx", null);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getModel() {
        return model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User getOwner() {
        return owner;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

}
