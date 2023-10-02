package com.mycompany.agency;

/**
 * A class representing an Intern employee, which is a child class of StaffEmployee.
 */
public class Intern extends StaffEmployee {

    /**
     * Constructor: Initializes an Intern employee with the specified information.
     *
     * @param eName    The name of the intern.
     * @param eAddress The address of the intern.
     * @param ePhone   The phone number of the intern.
     */
    public Intern(String eName, String eAddress, String ePhone) {
        // Call the constructor of the parent class (StaffEmployee)
        // Pass "XXX" as the Social Security number and 0 as the pay rate
        super(eName, eAddress, ePhone, "XXX", 0);
    }

    /**
     * Computes and returns a zero pay value for this intern.
     *
     * @return The pay amount for the intern (which is always 0).
     */
    public double pay() {
        return 0.0;
    }
}
