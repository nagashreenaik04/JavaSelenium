package day20_CollectionsAndMaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		
		//mylist.removeAll(mylist)
				//ArrayList allows the heterogeneous data
				//if we want to make a homogeneous data then 
//				ArrayList <String> mylist = new ArrayList<String>();
//				ArrayList <Integer> mylist = new ArrayList<Integer>();
//				ArrayList <Employee> mylist = new ArrayList<Employee>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(100);
		mylist.add(true);
		mylist.add(null);
		
		//Size of an arraylist
		System.out.println("Size of arraylist : " + mylist.size()); //7
		
		//Printing arraylist
		System.out.println("Printing data from arraylist : " +mylist); //[100, 10.5, welcome, A, 100, true, null]
		
		//Remove element from arraylist
		mylist.remove(4); //4th index
		System.out.println("After removing : " + mylist); //[100, 10.5, welcome, A, true, null]
		
		//Insert element in the arraylist
		mylist.add(3, "java");
		System.out.println("After insertion : "+ mylist); //[100, 10.5, welcome, java, A, true, null]
		
		//Modify element in the arraylist (modify/replace/change)
		mylist.set(3, "python");
		System.out.println("After replacing : " + mylist); //[100, 10.5, welcome, python, A, true, null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3)); //python
		
		//Reading all the elements from arraylist
		//1.Using normal for loop
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		//2.Using enhanced for loop OR for-each loop
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//3.Using iterator
		Iterator it = mylist.iterator();
		//when mylist contains the homogeneous data then 
		//Iterator<String> = mylist.iterator();
		//Iterator<Integer> = mylist.iterator();
		
		System.out.println(it.next()); //100 // it will print the first index value of the arraylist.
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		//hasNext() will go to the next index and check the element is present or not.
		
		//System.out.println(it.next()); //100  //Here we will get the error as "NoSuchElementException"
		//Because if we are entering the next() statement after the while loop. because "when there is no element left in the iterator to return"
		//iterator will check one by one value. if all the value is already checked and after that we are again asking the next value to access then we will get the error.
		
		//Checking arraylist is empty or not
		System.out.println("Is arraylist empty? " + mylist.isEmpty()); //false
		
		//Remove all the element from array list
		System.out.println(mylist); //[100, 10.5, welcome, python, A, true, null]
		
		//remove specific mulitple elements
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing specific mulitple elements : " +mylist); //[10.5, python, A, true, null]
		
		//remove all the elements/ clear
		mylist.clear();
		System.out.println(mylist); //[]
		System.out.println("Is arraylist empty? "+ mylist.isEmpty()); //true
		
		
		
		
		
	}

}
