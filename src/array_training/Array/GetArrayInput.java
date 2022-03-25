package array_training.Array;
import java.util.Scanner;

public class GetArrayInput {
    public static void main (String args[]){
        Scanner scr=new Scanner(System.in);
int [] arr=new int[5];
        System.out.println("Default values of array:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("\n\n****Initializing array****");
        System.out.println("Enter :"+arr.length + "Integer values :");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scr.nextInt();
        }
        System.out.println("**Initializing completed**\n");

        System.out.println("Array elements are :");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+ "\t");
        }
    }
}
