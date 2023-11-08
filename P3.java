public class P3{
    public static void main(String[] args){
        Long su = 600851475143L;

        for(int i=2; i<=su; i++){
            int cnt = 0;
            while(su%i==0){
                cnt = 1;
                su = su/i;
            }
            if(cnt==1){
                System.out.print(i);
            }
            if(su!=1 && cnt!=0){
                System.out.print("*");
            }
        }
    }
}