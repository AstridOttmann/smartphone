package org.example;

public class Friend extends Contact{
    private int phoneNumber;

    public Friend(String name, int phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }
    public Friend() {
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
