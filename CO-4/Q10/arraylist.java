import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
  
public class arraylist{  
   public static void main(String[] args){  
      ArrayList<String> alist = new ArrayList<String>();  
      alist.add("helna");
      alist.add("stinu");
      alist.add("archa");
      alist.add("vindu");
      alist.add("chandni");
      alist.add("kichu");
  
      //displaying elements
      System.out.println("The ArrayList is : "+alist);
  
      //Adding "anu" at the fourth position
      alist.add(3, "anu");
      System.out.println("ArrayList after adding anu at index 3 : "+alist);
      
      //Change an element at given index
      alist.set(0, "moosi");
      System.out.println("ArrayList after changing the element at index 0 : "+alist);

       //Removing "stinu" and "archa"
      alist.remove("stinu");
      alist.remove("archa");
      System.out.println("ArrayList after removing stinu and archa : "+alist);

      //Removing 3rd element
      alist.remove(2);
      System.out.println("ArrayList after removing element at index 2 : "+alist);

      //iterating ArrayList
      System.out.println("ArrayList elements are : ");
      for(String str:alist)    
       System.out.println(str);  

      //ArrayList size
      System.out.println("Number of elements in ArrayList: "+alist.size());

      //Sort ArrayList
      Collections.sort(alist);
       System.out.println("ArrayList elements after sorting : ");  
      for (String str : alist) 
         System.out.println(str);

      //Position of kichu in ArrayList
      System.out.println("Position of kichu in ArrayList : "+alist.indexOf("kichu"));

      //Element at position 2
      System.out.println("Element at position 2 :"+alist.get(2));

      //Check whether ArrayList contain the element or not
      System.out.println("If Arraylist contains chandni : "+alist.contains("chandni"));
      System.out.println("If Arraylist contains helna : "+alist.contains("helna"));
    
      //Remove all elements
      alist.clear();
      System.out.println("ArrayList after remove all elements (clear) : "+alist);
      
   }  
}
