package org.example;

public class BusinessContact extends Contact {
    private String companyName;
    private int phoneNumber;

    public BusinessContact(String companyName, String name, int phoneNumber) {
        super(name);
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
    }

    public BusinessContact() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
