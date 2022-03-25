package array_training.Array;

import java.util.Arrays;

public class CompareArray {
    public static void main (String args[]){
        int [] arr={10,20,30};
        int [] arr2={99,32,23,33,44};
        int [] arr3={10,20,30};

        if (arr==arr2  & arr==arr3)
            System.out.println("Same size of array");
        else if (Arrays.equals(arr, arr3))
            System.out.println("compared");
        else
            System.out.println("not matched");
    }
}
