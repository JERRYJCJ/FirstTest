package AbstractClass;
import AbstractClass.Animal;

public class Dog extends Animal {
	
	@Override
	public void eat()	{
		System.out.println("dog is eating...");
	}
}


class Cat extends Animal	{
	
	@Override
	public void eat()	{
		System.out.println("cat is eating...");
	}
}