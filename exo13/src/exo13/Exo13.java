package exo13;

import java.util.Scanner;

public class Exo13 {
    public static void main(String[] args){
        int ann = 2020;
        // verify is the date is valid
        Scanner saisir = new Scanner(System.in);
        System.out.println("saisir le jour de la date ");
        int j = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir le mois de la date ");
        int m = Integer.parseInt(saisir.nextLine());
        if(j>=30 && m==2){
            System.out.println("La date est invalide !!!");
        }else if(j>=1 && j<=31 && m>=1 && m<=12){
            System.out.println(j+"/"+m+"/"+ann);
            System.out.println("La date est Valide !!!");
        }
    }
}
