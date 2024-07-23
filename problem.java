import java.util.*;
public class problem {
    public static void print (int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j] + " ");
        System.out.println();
            }
    } 
}
    public static int [][] transpose(int arr[][],int r,int c) {
        int [][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
System.out.println(ans[i][j]+" ");
 }  
System.out.println();
        }        
 return arr;  
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of rows and column: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
int [][] arr=new int[r][c];
int totalelement=r*c;
System.out.println("enter"+r*c+"values:");
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    arr[i][j]=sc.nextInt();
    }  
}
    //transpose  
System.out.println("input matrix:");
print(arr);
System.out.println("transpose:");
int [][] ans=transpose(arr, r, c);
    }
}
    