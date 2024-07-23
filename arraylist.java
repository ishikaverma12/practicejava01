import java.util.*;
import java.util.Collections;
   public class arraylist {

 /*static void reverselist(ArrayList<Integer> list){
   int i=0,j=list.size()-1;
   while (i<j) {
      int temp=Integer.valueOf(list.get(i));
      list.set(i, list.get(j));
      list.set(j, temp);
      i++;
      j--;
   }

}*/

   public static void main(String[] args) {
     //wrapped
   // Integer i=Integer.valueOf(5);
   // System.out.println(i);
   ArrayList<Integer> l1=new ArrayList<>() ;
   l1.add(10);//method
   l1.add(6);
   l1.add(7);
   l1.add(8);
   //index 1
   /*System.out.println(l1.get(1));
   //for(int i=0;i<l1.size();i++){//method
   //loop
    //  System.out.println(l1.get(i));
  // }
  //print list 1 directly
   System.out.println(l1);
   //add an element in bich m
   l1.add(2,9);
      System.out.println(l1);
      //we remove an element
  // l1.remove(1);
   l1.remove(l1);
   System.out.println(l1);
   //check this element is in list or not
   Boolean ans=l1.contains(Integer.valueOf(7));
   System.out.println(ans);
   //make other list*/
   ArrayList l=new ArrayList<>();
   //array allow all type of element
    l.add("ishika");
   l.add('c');
   l.add(5);
   l.add(8.5);
   System.out.println("original array:"+l1);
   Collections.lastIndexOfSubList(l1, l);
   System.out.println("original array:"+l1);
   Collections.reverse(l1);
   Collections.sort(l1);
   System.out.println("reverse array: "+l1);
   Collections.reverse(l1);
  Collections.sort(l1);
  //Collections(l1.reverseOrder());
  ArrayList s=new ArrayList<>();
  s.add("ishika");
  s.add("is");
  s.add("good");
  s.add("girl");
  System.out.println(s);
  Collections.sort(s);
  System.out.println(s);


   }
}
