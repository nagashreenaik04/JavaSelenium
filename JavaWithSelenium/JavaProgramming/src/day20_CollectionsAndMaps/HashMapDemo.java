package day20_CollectionsAndMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration
		//HashMap mymap= new HashMap();
		Map mymap = new HashMap();
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Merry");
		hm.put(104, "Scott");
		System.out.println(hm); //{101=John, 102=Scott, 103=Merry, 104=Scott}
		
		hm.put(102, "David");
		System.out.println(hm); //{101=John, 102=David, 103=Merry, 104=Scott}
		
		//Size of a HashMap
		System.out.println("Size of HashMap : " + hm.size()); //4
		
		//remove pair
		hm.remove(103);
		System.out.println(hm); //{101=John, 102=David, 104=Scott}
		
		//retrieve the value of the specific value of the key
		System.out.println(hm.get(102));// David
		
		//get all the only keys from HashMap
		System.out.println(hm.keySet()); //[101, 102, 104]
		
		//get all the only values from the HashMap
		System.out.println(hm.values()); //[John, David, Scott]
		
		//get keys along with the values
		System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott]
		
		//Reading the data from looping
		//normal for loop is not possible
		//Using for-each loop
		for(int k: hm.keySet())
		{
			System.out.println(k+ "	"+hm.get(k));
		}
		//Output
		//101	John
		//102	David
		//104	Scott
		
		
		//Using Iterator read the data of the HashMap
		Iterator<Entry <Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "	"+ entry.getValue());
		}
		
		//clear data from HashMap
		System.out.println(hm.isEmpty());//false
		hm.clear();
		System.out.println(hm.isEmpty()); //true

	}

}
