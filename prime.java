import java.util.*;
public class prime {
   public static void main(string[] args) {
    int n,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:  ");
    n=sc.nextInt();
    int i=1;
while (i<=n) {
    if(n%i==0){
        count=count+1;
        i=i+1;
    }
   if(count==2){
    System.out.println("prime num");
   } 
   else{
    System.out.println("not prime num");
   }
}
sc.close();
}
} 

