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
        if (index < contactList.size()) {
            return contactList.get(index);
        }
        System.out.println("No contact with given index");
        return null;
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contactList) {
            if (name.equals(contact.getName())) {
                return contact;
            }
        }
        System.out.println("No contact with given name");
        return null;
    }

    public List<Contact> removeContactByName(String name) {
        for (Contact contact : contactList) {
            if (name.equals(contact.getName())) {
                contactList.remove(contact);
                return contactList;
            }
        }
        System.out.println("No contact with given name");
        return contactList;

    /*    contactList.removeIf(contact -> name.equals(contact.getName()));
        return contactList;*/
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
