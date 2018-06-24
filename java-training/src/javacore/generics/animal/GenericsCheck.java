package javacore.generics.animal;

public class GenericsCheck {
	
	public static void main(String[] args) {
		Animal<String> ts = new Animal<String>();
		ts.setT("vaibhav");
		
		Animal<Integer> ti = new Animal<Integer>();
		ti.setT(5);
	}

}
