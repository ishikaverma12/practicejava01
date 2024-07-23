import java.util.*;
public class ar2d {
    public static void array (int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j] + " ");
            }
        
        System.out.println();
    }
}
    public static void main(String[] args) {
        //literal method
        //int [][]arr={{3,4,6},{5,9,8,}};
       // for(int i=0;i<arr.length;i++){
           // for(int j=0;j<arr[i].length;j++){
                //System.out.println(arr.length);
//by indexing
/*int [][]arr=new int[2][3];
arr[0][0]=3;
arr[0][1]=4;
arr[0][2]=6;
System.out.println(arr[0][0]);
System.out.println(arr[0][1]);
System.out.println(arr[0][2]);

            }
        }*/
       // int [][] arr={{1,2,3},{4,5,6},{9,12,4}};
       Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ROWS: ");
    int r=sc.nextInt();
    System.out.println("ENTER COLUMN: ");
    int c=sc.nextInt();
    int [][] arr=new int [r][c];
    //for output
    System.out.println("element"+r*c+" array is");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    
    }
        array(arr);
    
    }
}