import java.util.Scanner;
import java.util.Arrays;
public class SameArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        // Create an array of integers with the given size
        int[] arr = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("element 2 arr:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
       // int []arr_2=arr.clone();
       //method 1
       int[] arr_2=Arrays.copyOf(arr, size);
        System.out.println("copied array is:");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      arr_2[0]=7;
      arr_2[1]=8;
      System.out.println("original array after changing:");
      for (int i = 0; i <arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("copy array after changing:");
      for (int i = 0; i <arr.length; i++) {
        System.out.print(arr_2[i] + " ");
    }

        // Close the scanner
        sc.close();
    }
}

