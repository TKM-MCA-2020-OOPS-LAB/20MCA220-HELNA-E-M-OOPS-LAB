import java.util.*;
public class MapInterface {
	public static void main (String args[])
	{
		Map<Integer,String> hm=new HashMap<>();

		 hm.put(1, "Stinu");
	        hm.put(2, "Anu");
	        hm.put(3, "Vindu");
	        System.out.println("Initial Map is: "+ hm);
	        
	        hm.put( (2), "Archa");
	        hm.put((4), "Chandni");
	        //Updating..
	        System.out.println("Updated Map is: " + hm);
	  
	        //Removing..
	        hm.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing the fourth entry, Final Map is : "+hm);
	}

}
