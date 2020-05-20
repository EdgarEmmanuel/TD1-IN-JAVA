package exo5;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[5];
        int somme=0;
        int j,i,val;
        for(i=0;i<5;i++){
            System.out.println("Saisir la valeur a la position "+i);
            val=Integer.parseInt(sc.nextLine());
            list[i]=val;
            somme+=val;
        }

        System.out.println("Somme des nombres : "+somme);


        System.out.println("======AFFICHAGE DU TABLEAU==========");
        for(j=0;j<5;j++){
            System.out.print(list[j]+" | ");
        }
    }
}
