package exo9;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args){
        // heure arrive et heure debut
        Scanner saisir = new Scanner(System.in);
        int h_arr,h_dep,m_arr,m_dep;
        int t_min_dep , t_min_arr;
        System.out.println("saisir l'heure de depart en entier : ");
        h_dep=Integer.parseInt(saisir.nextLine());
        System.out.println("saisir le temps en minutes de depart en entier : ");
        m_dep=Integer.parseInt(saisir.nextLine());
        System.out.println("saisir l'heure d'arrivee en entier : ");
        h_arr=Integer.parseInt(saisir.nextLine());
        System.out.println("saisir l'heure de depart en entier : ");
        m_arr=Integer.parseInt(saisir.nextLine());

        t_min_dep = (h_dep*60)+m_dep;

        t_min_arr = (h_arr*60)+m_arr;
        //methode 1
        //int res_min = t_min_arr - t_min_dep;
        //System.out.println(" la duree du temps du vol est "+(res_min/60)+"h"+(res_min%60)+"mn");

        // methode 2:le vol peu arriver le lendemain

        int total_hours = 60*24;
        int res_min = (total_hours-(t_min_dep))+t_min_arr;
        System.out.println(" la duree du temps du vol est "+(res_min/60)+"h"+(res_min%60)+"mn");
    }
}
