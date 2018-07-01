package javacore.collectionlearn;

import java.util.ArrayList;
import java.util.Iterator;

import javacore.collectionlearn.chocolate.DairyMilk;
import javacore.collectionlearn.chocolate.KitKat;

public class ArrayListGenericsDemo_ChocolateFactory {

	// public void getChocolates() {
	public static void main(String[] args) {

		DairyMilk item1 = new DairyMilk("D123-1", "Blue", 10, 25);
		DairyMilk item2 = new DairyMilk("D123-2", "Blue", 10, 25);

		KitKat item3 = new KitKat("D444-1", "Red", 10, 20);
		KitKat item4 = new KitKat("D444-2", "Red", 10, 20);

		ArrayList<DairyMilk> box = new ArrayList<DairyMilk>();
		box.add(item1);
		box.add(item2);

		/* 
		  box.add(item3); 		//    ####   Compilation error as we can not add item other than defined generic type i.e DairyMilk 
		  box.add(item4); */ 	// Error: The method add(DairyMilk) in the type ArrayList<DairyMilk> is not applicable for the arguments (KitKat) 

		// ****************** Use of Normal for loop ******************
		for (int i = 0; i < box.size(); i++) {
			System.out.println(box.get(i));
		}

		System.out.println(); // to priny empty line

		
		// ****************** Use of enhanced for loop (for each) ******************
		for (Object obj : box) //  #### We can take our item from DairyMilk object and store in Objejct type variable.
			System.out.println(obj);

		System.out.println(); // to priny empty line

		// ****************** Use of Iterator ******************

		//   ####  Iterator<Object> iterator = box.iterator(); //Iterator of type Object is not
		//   ####   allowed as box is type of DairyMilk. Error:Type mismatch: cannot convert from
		//   ####   Iterator<DairyMilk> to Iterator<Object>
		Iterator<DairyMilk> iterator = box.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();

			// Use of multi liner if
			if (obj instanceof DairyMilk) // instanceof - operator check if the objects is type of class DairyMilk
			{
				DairyMilk dm = (DairyMilk) obj; //    ####   Type Casting and assignment
				String barCode = dm.getBarCode();
				System.out.println("Dairy Milk - Barcode :" + barCode);
			}
		}

	}
}
