package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmploee

public class Intern extends StaffEmployee
{
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone)
    {
        super();
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    public double pay()
    {

        return payRate = 0.0;
    }