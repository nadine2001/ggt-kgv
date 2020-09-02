import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nadine
 */
public class KGV {
    public static void main(String args[]){
         
        Scanner eingabe = new Scanner(System.in);
         
        System.out.println("Was soll Ihre erste Zahl sein?");
        int ersteZahl = eingabe.nextInt();
        System.out.println("Was soll Ihre zweite Zahl sein?");
        int zweiteZahl = eingabe.nextInt();
         
        int ersteZahlTemp = ersteZahl;
        int zweiteZahlTemp = zweiteZahl;
         
        while (ersteZahlTemp != zweiteZahlTemp) {
            if (ersteZahlTemp < zweiteZahlTemp) {
                ersteZahlTemp += ersteZahl;
            } else {
                zweiteZahlTemp+= zweiteZahl;
            }
        }
         
        System.out.println("Der KGV ist: " + ersteZahlTemp);
 
    }
    
}

