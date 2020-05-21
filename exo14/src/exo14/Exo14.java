package exo14;

import java.util.Scanner;

public class Exo14 {
    public static void main(String[] args){

        // verify is the date is valid
        Scanner saisir = new Scanner(System.in);
        System.out.println("saisir le jour de la date ");
        int j = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir le mois de la date ");
        int m = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir l'anne de la date : ");
        int ann = Integer.parseInt(saisir.nextLine());
        if(j>=30 && m==2){
            System.out.println("La date est invalide !!!");
        }else if(j>=1 && j<=31 && m>=1 && m<=12){
            System.out.println(j+"/"+m+"/"+ann);
            System.out.println("La date est Valide !!!");
            if((ann / 4 >= 500) ){
                System.out.println("La date est bissextile ");
            }else{
                System.out.println("La date n'est pas bissextile !!!");
            }
        }
    }
}
