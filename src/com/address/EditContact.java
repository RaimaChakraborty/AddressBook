package com.address;

import java.util.Scanner;
public class EditContact extends InitialContact {
    void EditData(String firstname) {
        firstname = new String();

        System.out.println("Select Which data you want to Modify");
        System.out.println("FirstName : Press 1");
        System.out.println("LastName : Press 2");
        System.out.println("AddressName : Press 3");
        System.out.println("City : Press 4");
        System.out.println("State : Press 5");
        System.out.println("Zip : Press 6");
        System.out.println("Phone : Press 7");
        System.out.println("Email : Press 8");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        for(int i=0;i<contact.length;i++) {
            if(this.contact[i][0].equals(firstname)) {
                if(op==1) {
                    System.out.println("Enter New FirstName :");
                    this.contact[i][0]= scanner.nextLine();
                }

                if(op==2) {
                    System.out.println("Enter New LastName :");
                    this.contact[i][1]= scanner.nextLine();
                }

                if(op==3) {
                    System.out.println("Enter New Address :");
                    this.contact[i][2]= scanner.nextLine();
                }

                if(op==4) {
                    System.out.println("Enter New City :");
                    this.contact[i][3]= scanner.nextLine();
                }

                if(op==5) {
                    System.out.println("Enter New State :");
                    this.contact[i][4]= scanner.nextLine();
                }

                if(op==6) {
                    System.out.println("Enter New Zip :");
                    this.contact[i][5]= scanner.nextLine();
                }

                if(op==7) {
                    System.out.println("Enter New Phone :");
                    this.contact[i][6]= scanner.nextLine();
                }

                if(op==8) {
                    System.out.println("Enter New Email :");
                    this.contact[i][7]= scanner.nextLine();
                }
            }
            scanner.close();
        }
    }

    void Show() {
        for (int i=0;i<this.contact.length;i++) {
            for(int j=0;j<this.contact[i].length;j++) {
                System.out.print("\t\t"+this.contact[i][j]);
            }
            System.out.println();
        }
    }

}
