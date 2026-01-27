package day20_CollectionsAndMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declararion
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		
		//HashSet <Interger> myset = new HashSet<Integer>();
		
		//adding elements in to HashSet
		myset.add(100);
		myset.add("welcome");
		myset.add(true);
		myset.add(10.5);
		myset.add('A');
		myset.add(null);
		myset.add(100); //duplicate value will not print
		myset.add(null); //multiple null will not print
		
		System.out.println(myset); //[null, A, 100, 10.5, welcome, true] //insertion order is not preserved. data will enter randomly.
		
		//Size of the HashSet
		System.out.println(myset.size());
		
		//when we want a data in the insertion order then we will go for - ArrayList
		//if we don't want a duplicate data then we will go for - HashSet
		
		//Remove specific value from the HashSet
		myset.remove(10.5);
		System.out.println("After removing: " + myset); //[null, A, 100, welcome, true]
		
		//Inserting element is not possible in HashSet. because if we have store the value in a proper order then insertion will possible.
		//if element are storing randomly where we have to insert. so insertion is not possible in HashSet.
	
		//Retrieve/ Access the specific element from the HashSet not possible.
		//If we want to retrieve or access the specific element from the HashSet then we have a alternative method. i.e., 
		//Convert HashSet to ArrayList
		ArrayList al= new ArrayList(myset);
		System.out.println(al); //[null, A, 100, welcome, true]
		System.out.println(al.get(2)); //100
		
		//read all the using looping statement
		//normal loop is not read the data / not possible because 
		//Read all the element using for-each loop
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//Read the data using Iterator
		Iterator it = myset.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println(myset.isEmpty()); //false
		//In HashSet we can't remove multiple specific elements.
		//Remove all the elements / clearing all the elements in HashSet
		myset.clear();
		System.out.println(myset);//[]
		System.out.println(myset.isEmpty());//true

	}

}
