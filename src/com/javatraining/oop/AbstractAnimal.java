package com.javatraining.oop;

/*
 * Bu class oop temellerinden abstraction'a ornektir.
 * Gerçek dünyadaki herhangi bir seyi yazilima aktarirken soyutlamis oluruz.
 * 
 * */
public abstract class AbstractAnimal {
	
	public abstract void eat(String eatName);

	public void talk() {
		System.out.println("run run");
	}
}
