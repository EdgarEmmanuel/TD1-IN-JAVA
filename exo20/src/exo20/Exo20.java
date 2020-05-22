package exo20;

import java.util.Scanner;

public class Exo20 {
    public static void main(String[] args){
        Scanner saisir = new Scanner(System.in);
        int n =10;
        int max=0,posi=0;
        int[] numbers = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the value : ");
            int val = Integer.parseInt(saisir.nextLine());
            numbers[i]=val;
            if(val>max){
                max = val;
                posi =i;
            }
        }

        System.out.println("affichage du Tableau ");

        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" | ");
        }
        System.out.println(" ");

        System.out.println("The greatest number is "+max+" and he is at the position "+posi);


    }
}
