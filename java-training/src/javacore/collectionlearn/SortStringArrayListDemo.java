package javacore.collectionlearn;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("a");
		names.add("p");
		names.add("b");
		names.add("c");		
		names.add("r");
		names.add("p");
		
		System.out.println( "************* UnSorted data");
		for(String name:names)
			System.out.println(name);
		
		Collections.sort(names); //Collections class have static method called sort method which sort the list passed to it by reference (call by reference )
		
		System.out.println( "************* Sorted data");
		for(String name:names)
			System.out.println(name);
	}
}
