package exo1;

import java.util.Scanner;

public class exo1 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mois_prece=2;
        int mois_prece_prece=0;
        int i=1;
        int nb=0;
        while (nb<1000000000){
            nb=mois_prece+mois_prece_prece;
            mois_prece_prece=mois_prece;
            mois_prece=nb;
            if(i==12){
                System.out.println("Au 12eme mois le nombre de Lapin egal à:"+nb);
            }
            i++;
        }
        System.out.println("Le nombre de Lapin depassera 1 milliard le :"+i+" mois.");
    }
}
