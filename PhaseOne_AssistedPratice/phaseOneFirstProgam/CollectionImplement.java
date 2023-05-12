package phaseOneFirstProgam;
import java.util.*;

public class CollectionImplement {

	public static void main(String[] args) {
		//Creating arraylist  
		ArrayList<String> list = new ArrayList<String>();
		
		//Adding object in arraylist 
		list.add("Sourav"); 
		list.add("Hari");  
		list.add("Om");  
		list.add("Shiv");  
		
		//Traversing list through Iterator  
		Iterator itr = list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next()); 
		}
	}
}
