package phaseOneThirdProgram;

import java.util.*;

public class FourthSmallestInList {

	// declare arrylist
	List<Integer> integerList = new ArrayList<Integer>();
	
	//find the smallest in list
	public int findSmallest(List<Integer> list) {
		int smallest = list.get(0);
		for(int i = 0; i < list.size()  - 1; i++) {
			if(smallest >= list.get(i+1)) {
				smallest = list.get(i+1);
			}
		}
		return smallest;
	}
	
	//find smallest based on the input without sorting list
	public void findSmallestBasedOnPosition(List<Integer> list, int positionNumber) {
		List<Integer> duplicatelist = list;
		for(int i = 0; i < positionNumber; i++) {
			int result = findSmallest(duplicatelist);
			duplicatelist.remove(duplicatelist.indexOf(result));
			//System.out.println(duplicatelist);
			if(i == (positionNumber-1)) {
				System.out.println(result);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating the class of the object
		FourthSmallestInList fourthSmallestInList = new FourthSmallestInList();
		
		//adding in the array list
		fourthSmallestInList.integerList.add(4);
		fourthSmallestInList.integerList.add(8);
		fourthSmallestInList.integerList.add(2);
		fourthSmallestInList.integerList.add(1);
		fourthSmallestInList.integerList.add(0);
		fourthSmallestInList.integerList.add(8);
		fourthSmallestInList.integerList.add(22);
		fourthSmallestInList.integerList.add(11);
		
		System.out.println("Arraylist of integer is " +fourthSmallestInList.integerList);
		
		//fourth smallest number
		System.out.print("Fourth smallest number in a program is : " );
		fourthSmallestInList.findSmallestBasedOnPosition(fourthSmallestInList.integerList, 4);
	}

}
