package com.javatraining.oop;

/*
 * Bu interface implemente eden classlar run metodunu implemente etmek zorundadir.
 * 
 * bu interface baska bir interface extends edebilir. Birden fazla interface de extends edebilir.
 * */
public interface IAnimal extends IWriter{
	public void run();
}
