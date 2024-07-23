import java.util.Scanner;
public class arraycopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array:");
        int size=sc.nextInt();

        int [] arr=new int[size];

        System.out.print("element of an array:");
        for(int i=0;i < size;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("element of an array are:");
        
        for(int i=0;i < size;i++){
        System.out.println(arr[i] +" ");
        
    }
        sc.close();
        }
    }

