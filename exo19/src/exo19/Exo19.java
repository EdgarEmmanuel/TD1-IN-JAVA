package exo19;

import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args){
        int number;

        Scanner saisir = new Scanner(System.in);
        System.out.println("How many prices would you add ? : ");
        number=Integer.parseInt(saisir.nextLine());

        int[] prices = new int[number];
        int somme=0;
        // enter the values in the array
        for(int i=0;i<number;i++){
            System.out.println("Enter the price of the product at the psition "+(i+1)+" : ");
            int val = Integer.parseInt(saisir.nextLine());
            while(val%10!=0){
                System.out.println("Oups the price hould and with the number zero ,Enter the price of the product : ");
                 val = Integer.parseInt(saisir.nextLine());
            }
            prices[i]=val;
            somme+=val;
        }
        // display the sum of all the products
        System.out.println("Th sum of all the products is : "+somme+" FCFA");

        //  print all the content of the array

        for (int j=0;j<number;j++){
            System.out.print(prices[j]+" FCFA | ");
        }

    }
}
