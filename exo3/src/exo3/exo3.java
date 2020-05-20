package exo3;

import java.util.Scanner;

public class exo3 {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double  R1 ,R2,R3,rPara,rSerie;
        System.out.println("Saisir la valeur de la resistance R1");
        R1 = Double.parseDouble(sc.nextLine());
        System.out.println("Saisir la valeur de la resistance R2");
        R2 = Double.parseDouble(sc.nextLine());
        System.out.println("Saisir la valeur de la resistance R3");
        R3 = Double.parseDouble(sc.nextLine());
        rPara=(R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3);
        rSerie = R1+R2+R3;
        System.out.println("Resistance en parallele : "+rPara);
        System.out.println("Resistance en Serie : "+rSerie);
    }
}
