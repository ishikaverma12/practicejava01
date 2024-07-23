import java.util.*;
public class addarray {
/*public static void print (int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
        }
    
    System.out.println();
}
}
public static void array (int[][] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] + " ");
        }
    }
    System.out.println();
}
    public static void array (int[][] a,int r1,int c1,int r2,int c2,int [][]b){
if(r1!=c1 && r2!=c2){
    System.out.println("wrong input");
    return;
}
int[][] sum=new int [r1] [c1];
        for(int i=0;i< r1;i++){
            for(int j=0;j< c1;j++){
            System.out.print(sum[i][j] + " ");
            
         sum[i][j]=a[i][j]+b[i][j];
            }
        
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                System.out.print(a[i][j] + " ");
                }
            
            System.out.println();
        }
        }      
        System.out.println();
    
}
public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ROWS: ");
    int r1=sc.nextInt();
    System.out.println("ENTER COLUMN: ");
    int c1=sc.nextInt();
    int [][] a=new int [r1][c1];
    //for output
    
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("ENTER ROWS: ");
    int r2=sc.nextInt();
    System.out.println("ENTER COLUMN: ");
    int c2=sc.nextInt();
    int [][] b=new int [r2][c2];
    //for output
    
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println("matrix 1:");    
    
    System.out.println("mateix 2:");
    array(b);
    array(a, r1, c1, r2, c2, b);
    
}*/
public static void main(String[] args){

    int a[][]={{1,2,3},{5,6,7},{5,5,7}};
    int b[][]={{4,6,7},{5,4,4},{7,8,9}};
    int arr[][]=new int[3][3];
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
         arr[i][j]=a[i][j]+b [i] [j];
         System.out.print(arr[i][j]+" ");
    }
System.out.println();
}
}
}
