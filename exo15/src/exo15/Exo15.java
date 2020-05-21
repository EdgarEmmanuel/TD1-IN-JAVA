package exo15;

import java.util.Scanner;

public class Exo15 {
    public static void main(String[] args){
        Scanner saisir = new Scanner(System.in);
        System.out.println("saisir la valeur du nombre : ");
        int num = Integer.parseInt(saisir.nextLine());
        int somme=0;
        for (int i=1;i<=num;i++){
            somme+=i;
        }
        System.out.println("la somme des chiffres jusqu'a "+num+" est egal a "+somme);
    }
}
