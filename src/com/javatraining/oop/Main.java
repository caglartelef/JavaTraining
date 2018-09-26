package com.javatraining.oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat catObj=new Cat();
		catObj.setName("catOne");
		catObj.eat("milk");
		catObj.writer();
		
		Dog dogObj=new Dog();
		dogObj.setName("dogOne");
		dogObj.eat("meat");
		dogObj.writer();
		
	}
}
