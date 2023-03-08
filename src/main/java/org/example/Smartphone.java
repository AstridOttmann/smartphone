package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String brand;
    List<Contact> contactList;

    public Smartphone(String modelName, String brand, List<Contact> contactList) {
        this.modelName = modelName;
        this.brand = brand;
        this.contactList = contactList;
    }

    public Smartphone() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Contact> addContact(Contact contact) {
        contactList.add(0, contact);
        return contactList;
    }

    public Contact getContact(int index) {
        return contactList.get(index);
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
