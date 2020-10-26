
// Övning 13.1 sid 293.
// Övning 13.2
// Övning 13.3

import javax.swing.*;

public  class BilTest {
    public static void main(String[] args) {

Bil b1 = new Bil();
Bil b2 = new Bil();

b1.regNr = "ABC123";
b1.fabrikat = "Volvo";
b1.årsmodell = 1998;
b1.tjänstevikt = 800.00;
b1.motoreffekt = 120.00;

b2.regNr = "RTG365";
b2.fabrikat = "SAAB";
b2.årsmodell = 2001;
b2.tjänstevikt = 750;
b2.motoreffekt = 230;

        JOptionPane.showMessageDialog(null, b1.regNr + "\n" + b1.fabrikat
                + "\n" + b1.årsmodell + "\n" + b1.tjänstevikt
                + " kg\n" + b1.motoreffekt + " HP");

        JOptionPane.showMessageDialog(null, b2.regNr + "\n" + b2.fabrikat
                + "\n" + b2.årsmodell + "\n" + b2.tjänstevikt
                + " kg\n" + b2.motoreffekt + " HP");
    }
}


 class Bil {
    String regNr;
    String fabrikat;
    int årsmodell;
    double tjänstevikt;
    double motoreffekt;
}