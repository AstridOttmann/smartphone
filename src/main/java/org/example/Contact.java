package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Contact {
    protected String name;
    //List<Contact> contactList = new ArrayList<>();

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}
