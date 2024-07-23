import java.util.*;
//public static void zeroone(int [] arr){
   // int n=arr.length;

    //int zero=0;

  /*   for(int i=0;i<n;i++){
        if(arr[i]==0){
        zero++;
    }
}
    for(int i=0;i<n;i++){
        if(i<zero) {
            arr[i]=0;
        }
        else{
            arr[i]=1;
        }
        }
}*/
/*public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}*/
/**
 * twopointer
 */
public class twopointer {

public static void swap(int []arr,int i,int j){
    int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
static void variablr(int [] arr){
    int n =arr.length;
    int left=0;
    int right=n-1;
    while (left<right) {
        if(arr[left]%2==1 &&  arr[right]%2==0){
            swap(arr, left, right);
           
            left++;
            right--;
        }
        
    
    if(arr[left]%2==0){
        left++;
    }
    if (arr[right]%2==1){
        right--;
    }
}
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size of an array:");
    int size=sc.nextInt();

    int [] arr=new int[size];

    System.out.print("element of an array:");
    for(int i=0;i < size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("original array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    variablr(arr);
        System.out.print(" even and odd array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
          
    }
    }
}
