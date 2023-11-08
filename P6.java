public class P6{
    public static void main(String[] args){
        int[] kazu = new int[100];
        int sum1=0, sum2=0;
        int sa;

        for(int i=0; i<100; i++){
            kazu[i] = i+1;
        }

        for(int i=0; i<100; i++){
            sum1 += kazu[i]*kazu[i];
        }

        for(int i=0; i<100; i++){
            sum2 += kazu[i];
        }
        sum2 = sum2*sum2;

        sa = sum2 - sum1;
        System.out.println("差：" + sa);
    }
}