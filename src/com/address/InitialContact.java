package com.address;

public class InitialContact {
    String contact[][] = new String[20][8];

    InitialContact() {
        this.contact[0][0]="Raima";
        this.contact[0][1]="Chakraborty";
        this.contact[0][2]="Rakshachak";
        this.contact[0][3]="Kolaghat";
        this.contact[0][4]="West Bengal";
        this.contact[0][5]="721134";
        this.contact[0][6]="8972136266";
        this.contact[0][7]="abc@gmail.com";

        this.contact[1][0]="Taniya";
        this.contact[1][1]="Mukherjee";
        this.contact[1][2]="Raks";
        this.contact[1][3]="Kol";
        this.contact[1][4]="WB";
        this.contact[1][5]="721134";
        this.contact[1][6]="8317852489";
        this.contact[1][7]="cde@gmail.com";
    }

    void Show(){

        for (int i=0;i<this.contact.length;i++) {
            for(int j=0;j<this.contact[i].length;j++) {
                System.out.print("\t\t"+this.contact[i][j]);
            }
            System.out.println();
        }
    }
}
