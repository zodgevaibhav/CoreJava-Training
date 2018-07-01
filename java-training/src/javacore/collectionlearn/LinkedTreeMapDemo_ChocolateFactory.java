package javacore.collectionlearn;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import javacore.collectionlearn.chocolate.DairyMilk;
import javacore.collectionlearn.chocolate.KitKat;

public class LinkedTreeMapDemo_ChocolateFactory {

	public static void main(String[] args) {

		DairyMilk item1 = new DairyMilk("D123-1", "Blue", 10, 25);
		DairyMilk item2 = new DairyMilk("D123-2", "Blue", 10, 25);

		KitKat item3 = new KitKat("D444-1", "Red", 10, 20);
		KitKat item4 = new KitKat("D444-2", "Red", 10, 20);

		TreeMap box = new TreeMap(); //Sorted data alphabetically.
		box.put("MilindSir", item1);
		box.put("Priyanka", item3);
		box.put("Prajakta", item4);
		box.put("Vaibhav", item2);
		
		Iterator boxIterator = box.entrySet().iterator();
		
		while(boxIterator.hasNext())
		{
			Map.Entry entry = (Map.Entry)boxIterator.next();
			System.out.println("Key - "+entry.getKey()+" Value - "+entry.getValue());
		}

	}
}
