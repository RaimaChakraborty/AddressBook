package com.address;


public class NewContact extends InitialContact {
    String FirstName;
    String LastName;
    String Address;
    String City;
    String State;
    String Zip;
    String Phone;
    String Email;
    int t = 2;

    void AddContact(String firstname, String lastname, String address, String city, String state, String zip, String phone, String email) {


        this.FirstName = firstname;
        this.LastName = lastname;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip = zip;
        this.Phone = phone;
        this.Email = email;

        this.contact[t][0] = this.FirstName;
        this.contact[t][1] = this.LastName;
        this.contact[t][2] = this.Address;
        this.contact[t][3] = this.City;
        this.contact[t][4] = this.State;
        this.contact[t][5] = this.Zip;
        this.contact[t][6] = this.Phone;
        this.contact[t][7] = this.Email;
        t++;
    }

    void Show() {
        for (int i = 0; i < this.contact.length; i++) {
            for (int j = 0; j < this.contact[i].length; j++) {
                System.out.print("\t\t" + this.contact[i][j]);
            }
            System.out.println();
        }
    }
}

