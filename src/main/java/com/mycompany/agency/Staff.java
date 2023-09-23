package com.mycompany.agency;




public class Staff
{
    private final StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        staffList[0]= new Executive("Andrew","45 grove st", "5166667789", "908908098", 30.0);
        staffList[1]= new Executive("Mazen","89 hoke ave", "7188997876", "6789956759", 30.0);
        staffList[2]= new StaffEmployee("Bob","890 bow st", "838993933", "SSN", 30.0);
        staffList[3]= new TempEmployee("George","890 hello rd ", "798890", "SSN", 30.0);
        staffList[4]= new Intern("Henry", "89 world dr", "phone");
        staffList[5]= new Executive("MAtt","7980 just-dance rd", "phone", "SSN", 30.0);

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember);

            amount = staffMember.pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
