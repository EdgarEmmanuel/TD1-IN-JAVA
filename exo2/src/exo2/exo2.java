package exo2;

import java.util.Scanner;

public class exo2 {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("saisir la valeur a");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("saisir la valeur b:");
        b = Integer.parseInt(sc.nextLine());

        double qr = a/b;
        int r = a%b;
        System.out.println("Quotient Entier : "+Math.floor(qr));
        System.out.println("Reste de la division : "+r);
        System.out.println("Quotient Reel : "+qr);
    }
}
