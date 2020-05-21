package exo8;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args){
        Scanner saisir = new Scanner(System.in);
        //ax^2 +bx+c
        int disc ,a,b,c;
        double x1,x2;
        System.out.println("saisir la valeur de a :");
        a = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir la valeur de b:");
        b = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir la valeur de c:");
        c = Integer.parseInt(saisir.nextLine());
        System.out.println(a+"x^2 + "+b+"x +"+c);

        disc = (b*b) - 4*a*c;
        if(disc>0){
            System.out.println("Discriminant est Superieur a zero ");
            x1 = (-b + Math.sqrt(disc)) / 2*a;
            x2 = (-b - Math.sqrt(disc)) / 2*a;
            System.out.println("X1 = "+x1);
            System.out.println("X2 = "+x2);
        }else if(disc==0){
            System.out.println("Discriminant est egal a zero ");
            x1 = -b / (2*a);
            System.out.println("X1 = "+x1);
        }else{
            System.out.println("Pas de resultat car discriminant est inferieur a zero ");
        }
    }
}
