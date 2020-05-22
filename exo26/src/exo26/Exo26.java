package exo26;

public class Exo26 {
    public static void main(String[] args){
        int n=8;
        int[] ar = new int[n];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        ar[4]=5;
        ar[5]=6;
        ar[6]=7;
        ar[7]=8;

        int cpt_croissant=1,cpt_decroissant=1;


        for(int i=0;i<n;i++){
            if(i!=n-1){
                if(ar[i]<ar[i+1]){
                    cpt_croissant++;
                }else if(ar[i]>ar[i+1]){
                    cpt_decroissant++;
                }
            }
        }

       if(cpt_croissant==n){
           System.out.println("le tableau est dans l'ordre croissant !!");
       }else if(cpt_decroissant==n){
           System.out.println("tableau dans l'ordre Decroissant !!");
       }else{
           System.out.println("l'ordre du tableau est un ordre  quelconque ");
       }
    }
}
