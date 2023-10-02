package com.mycompany.agency;

/**
 * A class representing an Executive employee, which is a child class of StaffEmployee.
 */
public class Executive extends StaffEmployee {
    private double bonus;

    /**
     * Constructor: Initializes an Executive employee with the specified information.
     *
     * @param eName         The name of the executive.
     * @param eAddress      The address of the executive.
     * @param ePhone        The phone number of the executive.
     * @param socSecNumber  The Social Security number of the executive.
     * @param rate          The pay rate of the executive.
     */
    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; // bonus has yet to be awarded
    }

    /**
     * Awards the specified bonus to this executive.
     *
     * @param execBonus The bonus to be awarded to the executive.
     */
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    /**
     * Computes and returns the pay for an executive, which is the regular employee payment
     * plus a one-time bonus.
     *
     * @return The total pay for the executive, including the bonus.
     */
    public double pay() {
        return super.payRate + bonus;
    }
}
