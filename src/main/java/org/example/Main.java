package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> myContacts = new ArrayList<>();

        Smartphone myPhone = new Smartphone("Galaxy", "Samsung", myContacts);
        System.out.println(myPhone);

        Contact entry1 = new Friend("Anna", 123456789);
        //System.out.println(entry1);

        Contact businessEntry1 = new BusinessContact("Company Happy","Frau Nice", 55667788);
        //System.out.println(businessEntry1);

        Contact businessEntry2 = new BusinessContact("Company Happier","Frau Smile",  33445566);
        //System.out.println(businessEntry1);

        System.out.println(myContacts.add(entry1));
        System.out.println(myContacts.add(businessEntry1));

        System.out.println("List: " + myContacts);
        System.out.println("Phone: " + myPhone);
        //System.out.println(myContacts.add(businessEntry2));
        //System.out.println("Again Phone: " + myPhone);

        System.out.println("New method " + myPhone.addContact(businessEntry2));
        System.out.println("New Phone: " + myPhone);
        System.out.println("Get " + myPhone.getContact(1));
        System.out.println(myContacts.size());

    }
}