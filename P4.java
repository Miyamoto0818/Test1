import java.util.Arrays;
public class P4{
    public static void main(String[] args){
        int a, b, k, i, j;
        int[] seki = new int[10];
        int[] seki2 = new int[10];
        for(a=100; a<=999; a++){
            for(b=100; b<=999; b++){
                k = a*b;
                for(i=0; k>0; i++){
                    seki[i] = k%10;
                    k = k/10;
                }
                k=i-1;
                for(j=0; j<=k; j++){
                    seki2[j] = seki[k-j];
                }
                if(Arrays.equals(seki, seki2)){
                    for(i=0; i<=k; i++){
                        System.out.print(seki[i]);
                    }
                    System.out.println();
                }
            }
        }
    }
}