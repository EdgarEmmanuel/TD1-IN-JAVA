package exo10;

import java.util.Scanner;

public class exo10 {
    public static void main(String[] args){
        Scanner saisir = new Scanner(System.in);
        int i,j,svg;
        int [] tab = new int[3];
        System.out.println("----------SAISIE DES NOMBRES------------");
        for(i=0;i<3;i++){
            System.out.println("saisir la valeur du nombre "+i+1);
            tab[i]=Integer.parseInt(saisir.nextLine());
        }

        System.out.println("-----------Affichage du Tableau---------");
//        remplacement dans le tableau
        for(i=0;i<3;i++){
            for (j=i;j<3;j++){
                if(tab[i]>tab[j]){
                    svg = tab[i];
                    tab[i]=tab[j];
                    tab[j]=svg;
                }
            }
        }

        //boucle for printing the content after treatment
        for(i=0;i<3;i++){
            System.out.print(tab[i]+" | ");
        }

    }
}
