package array_training.Array;

public class SumofArray {
    public static void main(String args[]){
        int [] arr={18,27,30,41,55,33,};
        int sum=0;
        double avg=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum : "+sum);
        avg=sum/arr.length;
        System.out.println("Avg : "+avg);
    }
}
