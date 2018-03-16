package com.sgnatiuk;

import java.util.Date;

public class Contact {
    private final String name;
    private final String phoneNumber;
    private final Date dateOfBirth;
    private final String address;

    public Contact(String name, String phoneNumber, Date dateOfBirth, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
}
