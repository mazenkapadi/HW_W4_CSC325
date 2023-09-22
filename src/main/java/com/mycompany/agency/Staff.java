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

        staffList[0]= new Executive("name","address", "phone", "SSN", 30.0);
        staffList[1]= new Executive("name","address", "phone", "SSN", 30.0);
        staffList[2]= new StaffEmployee("name","address", "phone", "SSN", 30.0);
        staffList[3]= new TempEmployee("name","address", "phone", "SSN", 30.0);
        staffList[4]= new Intern("name", "address", "phone");
        staffList[5]= new Executive("name","address", "phone", "SSN", 30.0);

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
