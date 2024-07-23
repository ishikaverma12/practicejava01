import java.util.*;
public class calculatorswitch {
  public static void main(string args[]){
    int a,b,ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first value: ");
    a=sc.nextInt();
    System.out.println("enter second value: ");
    b=sc.nextInt();
    System.out.println("enter your switch add->1 sub->2 mul-> div->/n enter ur switch:");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1:
        System.out.println("addition is:"+(a+b));
        break;
        case 2:
        System.out.println("sub is:"+(a-b));
        break;
        case 3:
        System.out.println("multiply is:"+(a*b));
        break;
        case 4:
        System.out.println("division is:"+(a/b));
        break;
        default:
        System.out.println("invalid calculation");
    }
  }  
}
