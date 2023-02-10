package javatpoint08022023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages=new ArrayList();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Eneter the languages");
//add items to array list
				languages.add("kannada");
				languages.add("english");
				languages.add("hindi");
				languages.add("french");
		//print array list elemnts		
		System.out.println(languages);
		//access a particular item
		System.out.println(languages.get(0));
		//update a particular item
		languages.set(0, "kan");
		System.out.println("Aftee update "+languages.get(0));
		//Remove an item
		languages.remove(0);
		System.out.println("After Removal items "+languages);
		
		//index 0 after removal
		System.out.println("Aftee update "+languages.get(0));

		//Array list size
		System.out.println("The size of array list is "+languages.size());
		
		//To remove all array list elemnt
		languages.clear();
		
		System.out.println("After removal of all eelements"+languages);
		

		languages.add("kannada");
		languages.add("english");
		languages.add("hindi");
		languages.add("french");
		
		//Looping through array list
		for(int i=0;i<languages.size();i++)
		{
			System.out.println(languages.get(i));
		}

			
		//for each loop
		System.out.println("Print elements using for each loop");
		for(String s:languages) {
			System.out.println(s);
		}
		
		//Sort an array list
		Collections.sort(languages);
		
		System.out.println("After Sort  "+languages);
		
		
		//print using iterator
		System.out.println("Print using iterator");
	    Iterator<String> it = languages.iterator();
	    while(it.hasNext()) {
	    System.out.println(it.next());}
	}

}
