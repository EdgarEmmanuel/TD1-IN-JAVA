package exo6;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
    // distante = racine carrée de ((x2 – x1)^2  + (y2 – y1)^2)
        double x2,x1,y1,y2;
        double dist;
        Scanner saisir = new Scanner(System.in);
        System.out.println("saisir la valeur de x1 : ");
        x1=Double.parseDouble(saisir.nextLine());
        System.out.println("saisir la valeur de x2 : ");
        x2=Double.parseDouble(saisir.nextLine());
        System.out.println("saisir la valeur de y1 : ");
        y1=Double.parseDouble(saisir.nextLine());
        System.out.println("saisir la valeur de y2 : ");
        y2=Double.parseDouble(saisir.nextLine());

        dist = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println("La distance entre les deux points est : "+dist);
    }
}
