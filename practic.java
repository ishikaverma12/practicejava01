import java. util.*;
public class practic {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        a=sc.nextInt();
        System.out.println("enter b: ");
        b=sc.nextInt();
        System.out.println("enter c: ");
       c=sc.nextInt(); 
        if(a==b){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        sc.close();
    }
}