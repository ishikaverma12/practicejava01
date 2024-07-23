import java.util.*;
public class swrev {
    // using 3rd varible
/*  public   static void swap(int a,int b){
        System.out.println("array before swap:");
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("array after swap:");
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);
    }*/ 
    // without using 3 variable
public static void swa (int a,int b){
    System.out.println("array before swap:");
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("array after swap:");
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);

}

public static void main(String[] args){
    int []arr={1,2,3,4,5};
    int a=3;
    int b=7;
   // swap(a,b);
   swa(a, b);
}
}