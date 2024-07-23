import java.util.Scanner;

public class OccurrenceCounter {

   /*  public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count; // Return statement should be outside the loop
    }
    public static int lastindex(int[] arr, int x) {
   int  lastindex=-1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            lastindex=i;
}
    }
    return lastindex;
}*/
public static boolean issort (int[] arr)  {
    boolean check=true;
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]<arr[i-1]){
            check=false;
            break;
        }
    }
        return check;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
       // System.out.println("Enter x value:");
       // int x = sc.nextInt();
        
        System.out.println("Count of sorted: " + issort(arr));
        
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}

   
