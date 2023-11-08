import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int su = 2;
        int n;
        int sum = 1;
        while(su<=20){
            int kazu = su;
            System.out.print(su + ":");
            int i=2;
            while(i<=kazu){
                int flg = 0;
                if(kazu%i == 0){
                    flg = 1;
                    kazu = kazu/i;
                }
                if(flg == 1){
                    System.out.print(i);
                }
                if(kazu!=1 && flg!=0){
                    System.out.print("*");
                }
                if(kazu%i != 0){
                    i++;
                }
            }
            System.out.println();
            su++;
        }

        System.out.println("数値入力(0押したら終了)");
        n = scan.nextInt();
        while(n!=0){
            sum = sum*n;
            n = scan.nextInt();
        }
        System.out.println("sum:" + sum);
    }
}