package array_training.Array;

import java.util.Arrays;

public class CopyArray {

    public  static   void main (String args[]) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;
        System.out.println("copied array : "+ Arrays.toString(arr2));
    }
}
