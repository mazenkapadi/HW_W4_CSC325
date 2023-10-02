package com.mycompany.agency;

/**
 * A class representing a Staff Employee, which is a child class of StaffMember.
 */
public class StaffEmployee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    /**
     * Constructor: Initializes a Staff Employee with the specified information.
     *
     * @param eName            The name of the staff employee.
     * @param eAddress         The address of the staff employee.
     * @param ePhone           The phone number of the staff employee.
     * @param socSecNumber     The Social Security number of the staff employee.
     * @param rate             The pay rate of the staff employee.
     */
    public StaffEmployee(String eName, String eAddress, String ePhone,
                         String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    /**
     * Returns information about a staff employee as a string.
     *
     * @return A string representation of the staff employee's information.
     */
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone +
                "\nSocial Security Number: " + socialSecurityNumber + "\nPay Rate: " + payRate;
    }

    /**
     * Returns the pay rate for this staff employee.
     *
     * @return The pay rate of the staff employee.
     */
    public double pay() {
        return payRate;
    }
}
