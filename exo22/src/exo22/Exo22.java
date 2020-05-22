package exo22;

public class Exo22 {
    public  static  void main(String[] args){
        int n=9;
        int[] ar = new int[n];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        ar[4]=5;
        ar[5]=6;
        ar[6]=7;
        ar[7]=8;
        ar[8]=2;

        int svg=0 ,last=0, svg2=0 ,pos=0, posi=0,cpt=0;
        int bool =0;
        for(int i=0;i<n;i++) {
            if (i != n-1) {
                if (ar[i] < ar[i + 1]) {
                    cpt++;
                    last = ar[i + 1];
                    posi = i + 1;
                    bool=1;
                } else {
                    if (cpt > svg) {
                        bool=2;
                        svg = cpt;
                        svg2 = last;
                        pos = posi;
                    }
                    cpt = 0;
                    last = 0;
                    posi = 0;
                }
            }
        }
        if(bool==1){
            System.out.println("La suite est de longeur : "+cpt);
            System.out.println("le dernier nombre de la suite est "+last+" et il est  a la position "+posi);
        }else{
            System.out.println("La suite est de longeur : "+svg);
            System.out.println("le dernier nombre de la suite est "+svg2+" et il est  a la position "+pos);
        }

    }
}
