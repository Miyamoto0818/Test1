import java.util.*;
public class P7{
    public static void prime(int n){
        int k = 1;
        boolean[] isPrime = new boolean[n+1];
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }
        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                if(k==10001){
                    System.out.println(k + "番目：" + i);
                    break;
                }
                k++;
            }
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0){
            prime(n);
            n=sc.nextInt();
        }
    }
}