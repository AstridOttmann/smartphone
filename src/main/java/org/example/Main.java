package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        List<Contact> myContacts = new ArrayList<>();

        Smartphone myPhone = new Smartphone("Galaxy", "Samsung", myContacts);
        System.out.println(myPhone);

        Contact entry1 = new Friend("Anna", 123456789);

        Contact businessEntry1 = new BusinessContact("Company Happy", "Frau Nice", 55667788);

        Contact businessEntry2 = new BusinessContact("Company Happier", "Frau Smile", 33445566);

        myContacts.add(entry1);
        myContacts.add(businessEntry1);

        System.out.println("List: " + myContacts);
        System.out.println("Phone: " + myPhone);
        //System.out.println(myContacts.add(businessEntry2));
        //System.out.println("Again Phone: " + myPhone);

        myPhone.startRadio();
        myPhone.stopRadio();
        myPhone.getPosition();

        System.out.println("Add method " + myPhone.addContact(businessEntry2));
        System.out.println("Add method " + myPhone.addContact(entry1));
        System.out.println("Add method " + myPhone.addContact(entry1));
        System.out.println("Phone actual: " + myPhone);

        System.out.println(myContacts.size());

        System.out.println("------------");
        try {
            System.out.println("Get " + myPhone.getContact(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Get by name " + myPhone.getContactByName("anna"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Remove " + myPhone.removeContactByName("Anna"));
        System.out.println(myContacts.size());


    }
}