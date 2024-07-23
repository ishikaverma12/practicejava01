import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int fact=1;
        int n,i;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        for( i=1;i<=n;i++){
            fact=fact*i;
        }
    System.out.println(fact);
    }
}
