package com.mycompany.agency;

/**
 * The main class for creating a staff of employees for an agency and paying them.
 */
public class Agency {
    /**
     * Main method that creates a staff of employees and pays them.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a staff of employees
        Staff personnel = new Staff();

        // Perform payday processing
        personnel.payday();
    }
}
