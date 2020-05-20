package exo4;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir la valeur du nombre ");
        double  number = Double.parseDouble(sc.nextLine());
        System.out.println("saisir l⁷a valeur de l'exposant ");
        double expo = Double.parseDouble(sc.nextLine());

        //========METHODE 1============
        //double  value = Math.pow(number,expo);
        //System.out.println("le resultat du calcul est : "+value);


        //=========METHODE 2============

        int i=0;
        int result=1;

        while(i<expo){
            result*=number;
            i++;
        }

        System.out.println("le resultat du calcul est : "+result);

    }
}
