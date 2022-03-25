package array_training.Array;
public class ArrUsingForeach {
    public static void main (String args[]){
        int [] arr={10,20,30,40,50};
        for (int i:arr)
        {
          System.out.print(" "+i);
        }
        System.out.println();
        int arr1[][] = {{50,60},{70,80},{90,100}};

        // display 2D array using for-each loop
        for(int[] k : arr1) {
            for(int j : k) {
                System.out.print(j + " ");
            }
    }}}

