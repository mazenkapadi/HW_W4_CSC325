package com.mycompany.agency;

/**
 * A class representing a staff of employees.
 */
public class Staff {
    private final StaffMember[] staffList;

    /**
     * Constructor: Initializes the list of staff members.
     */
    public Staff() {
        staffList = new StaffMember[6];

        // Create and initialize different types of staff members
        staffList[0] = new Executive("Andrew", "45 grove st", "5166667789", "908908098", 30.0);
        staffList[1] = new Executive("Mazen", "89 hoke ave", "7188997876", "6789956759", 30.0);
        staffList[2] = new StaffEmployee("Bob", "890 bow st", "838993933", "SSN", 30.0);
        staffList[3] = new TempEmployee("George", "890 hello rd ", "798890", "SSN", 30.0);
        staffList[4] = new Intern("Henry", "89 world dr", "phone");
        staffList[5] = new Executive("MAtt", "7980 just-dance rd", "phone", "SSN", 30.0);

        // Award a bonus to the first Executive
        ((Executive) staffList[0]).awardBonus(500.00);

        // Add hours worked for the TempEmployee
        ((TempEmployee) staffList[3]).addHours(40);
    }

    /**
     * Pays all staff members and displays payment information.
     */
    public void payday() {
        double amount;

        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember);

            amount = staffMember.pay(); // Polymorphic method call

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}