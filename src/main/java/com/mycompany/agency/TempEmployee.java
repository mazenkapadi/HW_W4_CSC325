package com.mycompany.agency;

/**
 * A class representing a Temporary Employee, which is a child class of StaffEmployee.
 */
public class TempEmployee extends StaffEmployee {
    private int hoursWorked;

    /**
     * Constructor: Initializes a Temporary Employee using the specified information.
     *
     * @param eName         The name of the temporary employee.
     * @param eAddress      The address of the temporary employee.
     * @param ePhone        The phone number of the temporary employee.
     * @param socSecNumber  The Social Security number of the temporary employee.
     * @param rate          The hourly pay rate of the temporary employee.
     */
    public TempEmployee(String eName, String eAddress, String ePhone,
                        String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    /**
     * Adds the specified number of hours to this employee's accumulated hours worked.
     *
     * @param moreHours The number of hours to add.
     */
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    /**
     * Computes and returns the pay for this hourly employee.
     *
     * @return The total pay for the hourly employee.
     */
    public double pay() {
        return hoursWorked * super.payRate;
    }

    /**
     * Returns information about this hourly employee as a string.
     *
     * @return A string representation of the hourly employee's name and ID.
     */
    public String toString() {
        return "Employee Name: " + super.name + "\nEmployee ID: " + super.socialSecurityNumber;
    }
}
