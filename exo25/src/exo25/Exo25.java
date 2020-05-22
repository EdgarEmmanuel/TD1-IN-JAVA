package exo25;

public class Exo25 {
    public static void main(String[] args){
        int n = 10;
        for(int i=1;i<=n;i++){
            int val =0;
            while(val<i){
                System.out.print(i);
                val+=1;
            }
            System.out.println(" ");
        }
    }
}
