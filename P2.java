public class P2{
    public static void main(String[] args){
        int su1=1, su2=2, su3;
        int sum1=2;

        while(sum1 < 4000000){
            su3 = su1 + su2;
            if(su3%2==0){
                sum1 += su3; 
            }
            System.out.println("su3 " + su3);
            System.out.println("sum1 " + sum1);
            su1 = su2;
            su2 = su3;
        }
        System.out.println(sum1);
    }
}