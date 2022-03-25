package array_training.Array;

public class ReturnArray {
    public  static void main(String args[]){
        int[] arr = readArray();
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
    public static int[] readArray(){
        int[]arr1={10,20,30,40,50};
        return arr1;
    }
}
