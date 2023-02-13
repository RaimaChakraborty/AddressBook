package com.address;
import java.util.Scanner;
class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        System.out.println("---------------------------------");

        System.out.println("Please Choose option from Below");
        System.out.println();
        System.out.println("To Show AddressBook : Press 1");
        System.out.println("To Add Contact to AddressBook : Press 2");
        //System.out.println("To Edit Contact in AddressBook : Press 3");
       // System.out.println("To Delete Contact from AddressBook : Press 4");


        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
       // Scanner sc3 = new Scanner(System.in);

        int option = scanner.nextInt();

        switch(option) {
            case 1 : {
                NewContact nc = new NewContact();
                nc.Show();
            }
            break;

            case 2 : {
                System.out.println("Enter New FirstName");
                String fistname = scanner2.nextLine();

                System.out.println("Enter New LastName");
                String lastname = scanner2.nextLine();

                System.out.println("Enter New Address");
                String address = scanner2.nextLine();

                System.out.println("Enter New City");
                String city = scanner2.nextLine();

                System.out.println("Enter New State");
                String state = scanner2.nextLine();

                System.out.println("Enter New Zip Code");
                String zip = scanner2.nextLine();

                System.out.println("Enter New Phone No");
                String phone = scanner2.nextLine();

                System.out.println("Enter New Email");
                String email = scanner2.nextLine();

                NewContact nc = new NewContact();
                nc.AddContact(fistname,lastname,address,city,state,zip,phone,email);
                nc.Show();
            }
            break;

            /*case 3 : {
                System.out.println("Please Select the Contact to Edit !!!!!");
                System.out.println("Enter the First Name :");
                String firstname = sc3.nextLine();

                EditContact ec = new EditContact();
                ec.EditData(firstname);

                //ec.Show();
            }
            break;

            case 4 : {}
            break;*/

            default : System.out.println("Invalid Option");
                break;
        }
        scanner.close();
        scanner2.close();
       // sc3.close();
    }
}
