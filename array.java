import java.util.*;
   
   // int sum=0;
  //  for(int i=0;i<5;i++){
     // sum=sum+arr[i];
   // }
    //System.out.println(sum);
    //max
   // int arr[]={2,6,4};
//int ans=0;
//for(int i=0;i<arr.length;i++)
 // if(arr[i]>ans){
  //  ans=arr[i];
  //}
 // System.out.println("max is:"+ans);
//
//search a num in array
public class array {
  public static void main(String[] args) {
int arr[]={20,4,14,20};
int size=-1;
int x=1;
for(int i=0;i<arr.length;i++){
  if(arr[i]==x){
    size=i;
  System.out.println("found at "+x+"index "+size); 
    break;
}
else{
  System.out.println("not found element");
}
}
} 
}
