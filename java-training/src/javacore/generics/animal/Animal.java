package javacore.generics.animal;

public class Animal<T>{
	private T t;
	
	public void setT(T ta)
	{
		this.t = ta;
	}
	
	public T getT()
	{
		return this.t;
	}

}
