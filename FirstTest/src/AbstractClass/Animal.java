/**
 * 
 */
package AbstractClass;

/**
 * @author Administrator
 *
 */
public abstract class Animal {
	String color;
	String name;
	
	public void eat()	{
		System.out.println("animal is eating...");
	}
	
	public Animal()	{
		
	}
	
	public Animal(String color) {
		
		this.color=color;
	}
}
