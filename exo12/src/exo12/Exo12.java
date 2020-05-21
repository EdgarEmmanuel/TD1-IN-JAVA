package exo12;

import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args){
        int total=0,a,i;
        Scanner saisir = new Scanner(System.in);
        System.out.println("saisir la valeur du nombre : ");
        a=Integer.parseInt(saisir.nextLine());

        for (i=1;i<a;i++){
            if(a%i==0){
                total+=i;
            }
        }

        if(total==a){
            System.out.println("le nombre "+a+" est un nombre parfait !!!!");
        }
    }
}
