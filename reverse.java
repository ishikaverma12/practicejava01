import java.util.*;

public class reverse {

    // Method to reverse an array
   /*  public static int[] revarray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        int j=0;
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
    }    
        return reversed;
    }
*/


static void swrev(int arr[] ,int i,int j){
    
    int temp=arr[i];
   arr [i]=arr[j];
    arr[j]=temp;

}
static void reve(int [] arr){
    int i=0,j=arr.length-1;
    while (i<j) {
        
        swrev(arr, i, j);
        i++;
        j--;

    }

}
    // Method to print an array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 55, 6, 7};
       // int[] reversedArr = revarray(arr);
       // print(reversedArr);
       
       reve(arr);
swrev(arr, 4, 4);
    }
}