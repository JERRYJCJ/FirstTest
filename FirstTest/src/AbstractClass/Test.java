package AbstractClass;
import AbstractClass.Dog;

public class Test {
	public static void main(String[] args) {
		System.out.println("this is test class");
		
		//Animal animal = new Animal();
		Animal animal;
		animal=new Dog();
		animal.eat();
		
		animal=new Cat();
		animal.eat();
		
		animal=new Animal() {
		};
		animal.eat();
		
		Dog dog = new Dog();
		dog.eat();
	}
}
