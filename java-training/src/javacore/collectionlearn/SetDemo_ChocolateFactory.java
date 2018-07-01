package javacore.collectionlearn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javacore.collectionlearn.chocolate.DairyMilk;
import javacore.collectionlearn.chocolate.KitKat;

public class SetDemo_ChocolateFactory {

	//public void getChocolates() {
		public static void main(String[] args) {

		DairyMilk item1 = new DairyMilk("D123-1", "Blue", 10, 25);
		DairyMilk item2 = new DairyMilk("D123-2", "Blue", 10, 25);

		KitKat item3 = new KitKat("D444-1", "Red", 10, 20);
		KitKat item4 = new KitKat("D444-2", "Red", 10, 20);

		
		Set box = new HashSet();
		box.add(item1);
		box.add(item2);
		box.add(item3);
		box.add(item4);
		box.add(item4);//Duplicate  item not inserted.
		box.add(item4);//Duplicate  item not inserted.
	
		
		//****************** Use of Normal for loop ******************
				/*for(int i=0;i<box.size();i++)
				{
					System.out.println(box.get(i)); //Compilation error, no indexed access allowed like ArrayList.
				}*/
		
		
		
		//****************** Use of  enhanced for loop (for each) ******************
		for(Object obj:box)
			System.out.println(obj);
		
		System.out.println(); //to priny empty line		

		//******************  Use of Iterator ******************
		Iterator<Object> iterator = box.iterator();
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			
			//Use of multi liner if
			if(obj instanceof DairyMilk)   //instanceof - operator check if the objects is type of class DairyMilk
				{
					DairyMilk dm = (DairyMilk)obj; //Type Casting and assignment
					String barCode = dm.getBarCode();
					System.out.println("Dairy Milk - Barcode :"+barCode); 
				}

			//Use of one liner if
			if(obj instanceof KitKat)	//instanceof - operator check if the objects is type of class DairyMilk
				System.out.println("Kitkat - Barcode :"+((KitKat)obj).getBarCode()); //Type Casting
			
		}
	
	}
}
