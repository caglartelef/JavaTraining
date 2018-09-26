package com.javatraining.oop;

/*
 * Bu class oop temellerinden inheritance ornektir.
 * Cat classi, AbstractAnimal abstract classindan extends edilir ve inheritance uygulanmis olur.
 * eat() metodu super classta absract tanimlandigi icin burada override etmis bulunuyoruz.
 * 
 * Bu classin extends keywordu kullanilarak sadece bir tane atasi olabileceginden dolayi diger kullanmak istedigimiz ozellikleri eklemek
 * icin interfaceleri kullanabiliriz.
 *  
 * */
public class Cat extends AbstractAnimal implements IAnimal{

	/* 
	 * Burada tanimlamis oldugumuz degiskenler encapsulation ornektir.
	 * */
	private String name;   // private oldugundan dolayi bu degiskene erismek icin setter & getter metotlarini ekledik.
	protected String age;  // protected tanimladigimiz icin eger bu classtan baska bir class extends ederse setter & getter metotlari olmadan erisebilecektir.
	public String type;    // public tanimladigimiz icin setter & getter metotlarina gerek duymadan her yerden erisebiliyoruz.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat(String eatName) {
		System.out.println("Cat eat "+eatName);
	}

	/*
	 * Bu metot IAnimal interfacenden implemente edilmistir.
	 * */
	@Override
	public void run() {
		System.out.println("Cat run");
		
	}
	
	/*
	 * Bu metot IWriter interfacenden implemente edilmistir.
	 * */
	@Override
	public void writer() {
		System.out.println("This class name is Cat");
		
	}

}
