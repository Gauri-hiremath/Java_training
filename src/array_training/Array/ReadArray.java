package array_training.Array;

import java.util.Arrays;

public class ReadArray {
    public static void main(String args[]){
        int [] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));

        int arr1[][] = {{50,60},{70,80},{90,100}};

        // display 2D array using Arrays.deepToString()
        System.out.print(Arrays.deepToString(arr1));
    }
}
