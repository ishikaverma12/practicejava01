import java.util.*;
public class calculator {
    public static void main(String args[]){
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number: ");
        a=sc.nextInt();
        System.out.println("enter second number: ");
        b=sc.nextInt();
        System.out.println("enter your choice 1-> add 2->sub 3->mul 4->div/n enter your choice: ");
        ch=sc.nextInt();
         if(ch==1){
            System.out.println("addition is:"+ (a+b));
         }
         else if (ch==2){
            System.out.println("subtractor is:"+(a-b));
         }
         else if (ch==3){
            System.out.println("multiply is:"+(a*b));
         }
          else  if(ch==4){
            System.out.println("division is:"+(a/b));
         }
          else{
            System.out.println("invalid calculation");
         }


    }
}
