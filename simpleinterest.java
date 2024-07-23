import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        int simpleinterest,p,r,t;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter principle value: "); 
       p=sc.nextInt();
       System.out.println("enter rate value: "); 
       r=sc.nextInt();
       System.out.println("enter time value: "); 
       t=sc.nextInt();
       simpleinterest=(p*r*t)/100;
       System.out.println(simpleinterest); 


    }
}
