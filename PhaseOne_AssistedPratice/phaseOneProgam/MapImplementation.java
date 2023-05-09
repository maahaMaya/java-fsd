package phaseOneProgam;
import java.util.*;

public class MapImplementation {

	public static void main(String[] args) {
		//Hash Map
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  //Add value in hash map
		  map.put(100,"Sourav");  
		  map.put(101,"Hari");  
		  map.put(102,"Om");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
	}

}
