package exo21;

import java.util.Scanner;

public class Exo21 {
    public static void main(String[] args){
        // 21 and 24
        Scanner saisir = new Scanner(System.in) ;
        int a ,b;
        System.out.println("User 1 , please enter the secret number !!! : ");
        a = Integer.parseInt(saisir.nextLine());

        System.out.println("User 2 , Guess the secret number : ");
        b = Integer.parseInt(saisir.nextLine());

        while(b!=a){
            if(b>a){
                System.out.println("Oups number too great Come on User 2 , Try again Guess the secret number : ");
                b = Integer.parseInt(saisir.nextLine());
            }else{
                System.out.println("Number too less Come on User 2 , you're near Guess the secret number : ");
                b = Integer.parseInt(saisir.nextLine());
            }
        }

        System.out.println("It was not so complicated , you've find it : "+b);
    }
}
