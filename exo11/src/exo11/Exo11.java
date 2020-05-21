package exo11;

import java.util.Scanner;

public class Exo11 {
    public static void Calcul(int a , int b , String car){
        int val=0;
        switch (car){
            case "+":
                val=a+b;
                System.out.println("a+b = "+val);
                break;
            case "-":
                val=a-b;
                System.out.println("a-b = "+val);
                break;
            case "/":
                if(b==0){
                    System.out.println("calcul impossible");
                }else{
                    val = a/b;
                    System.out.println("a/b = "+val);
                }
                break;
            case "%":
                if(b==0){
                    System.out.println("calcul impossible");
                }else{
                    val = a%b;
                    System.out.println("a%b = "+val);
                }
                break;
            default:
                System.out.println("Calcul Impossible");
                break;
        }
    }
    public static void main(String[] args){
        int a ,b;
        String car;
        Scanner saisir = new Scanner(System.in);
        System.out.println("saisir la valeur de a : ");
        a = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir la valeur de b : ");
        b = Integer.parseInt(saisir.nextLine());
        System.out.println("saisir le signe de l'operation : ");
        car = saisir.nextLine();
        Calcul(a,b,car);
    }
}
