package exo18;

import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args){
        // ppcm = (a*b)/pgcd(a,b)
        int a , b;
        Scanner saisir = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = Integer.parseInt(saisir.nextLine());
        System.out.println("Enter the value of b : ");
        b = Integer.parseInt(saisir.nextLine());
        System.out.println("("+a+","+b+")");

        int reste , svg=0 ,svg2=0;
        int cal = a*b;

        if(a>b){
            reste = a-b;
            while (reste != 0){
                reste = a-b;
                svg = reste;
                a = b;
                b = svg ;
                svg2=a;
            }
        }else{
            reste = b-a;
            while (reste != 0){
                reste = b-a;
                svg = reste;
                b = a;
                a = svg ;
                svg2=b;
            }
        }
        double ppcm = cal/svg2;
        System.out.println("The PPCM is "+(int)ppcm);
    }
}
