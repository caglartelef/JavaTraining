package com.javatraining.oop;

public class Dog extends AbstractAnimal implements IAnimal{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat(String eatName) {
		System.out.println("Dog eat "+eatName);
	}

	/*
	 * Bu metot IAnimal interfacenden implemente edilmistir.
	 * */
	@Override
	public void run() {
		System.out.println("Dog run");
		
	}
	
	/*
	 * Bu metot IWriter interfacenden implemente edilmistir.
	 * */
	@Override
	public void writer() {
		System.out.println("This class name is Dog");
		
	}

}
