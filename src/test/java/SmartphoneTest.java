import org.example.BusinessContact;
import org.example.Contact;
import org.example.Friend;
import org.example.Smartphone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartphoneTest {
    @Test
    void addsContactOnTopOfList() {
        Contact contact = new Friend("Anna", 1234567);
        Contact testContact = new BusinessContact("Test", "Frau Test", 1234567);

        List<Contact> testList = new ArrayList<>(Arrays.asList(contact, contact));
        // testList.add(contact);

        Smartphone testPhone = new Smartphone("Experia", "Samsung", testList);
        testPhone.addContact(testContact);

        List<Contact> expected = new ArrayList<>(Arrays.asList(testContact, contact, contact));
        assertEquals(expected, testPhone.getContactList());

   /*     List<Contact> expected = new ArrayList<>();
        expected.add(testContact);
        Smartphone expectedPhone = new Smartphone("Experia", "Samsung", expected);*/

        //assertArrayEquals(expectedPhone.getContactList(), actual);

    }

    @Test
    void returnsFalseWhenContactNotOnTopOfList() {
        Contact contact = new Friend("Anna", 1234567);
        Contact testContact = new BusinessContact("Test", "Frau Test", 1234567);

        List<Contact> testList = new ArrayList<>(Arrays.asList(contact, contact));
        // testList.add(contact);

        Smartphone testPhone = new Smartphone("Experia", "Samsung", testList);
        testPhone.addContact(testContact);

        List<Contact> expected = new ArrayList<>(Arrays.asList(contact, testContact, contact));
        boolean actual = testPhone.getContactList().equals(expected);
        assertFalse(actual);
    }
}
