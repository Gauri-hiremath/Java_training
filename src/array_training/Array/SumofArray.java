package array_training.Array;

public class SumofArray {
    public static void main(String args[]){
        int [] arr={10,20,30,40,50};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum : "+sum);

        Scanner scan = new Scanner(System.in);

        // take size of array
        System.out.print("Enter number of elements: ");
        int number = scan.nextInt();

        // declare array with given size
        int array[] = new int[number];

        // take input for array elements
        System.out.println("Enter array elements: ");
        for (int i=0; i<array.length; i++) {
            array[i] = scan.nextInt();
        }

        // initialize sum variable with 0
        int sum = 0;

        // add array elements to sum
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        // display the result
        System.out.println("Sum of array elements= " + sum);
    }
}
