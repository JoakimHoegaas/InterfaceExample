package com.company;

public class CustomerModel {

    public String FirstName;
    public String LastName;
    public String StreetAddress;
    public String City;
    public String EmailAddress;
    public String PhoneNumber;

    public CustomerModel(String firstName, String lastName, String streetAddress,
                         String city, String emailAddress, String phoneNumber)
    {
        FirstName = firstName;
        LastName = lastName;
        StreetAddress = streetAddress;
        City = city;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
    }
}
