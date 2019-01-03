import java.util.Scanner;
//import a.b.c.e.ClassPolymorphism;

import javax.imageio.stream.MemoryCacheImageInputStream;

//import a.b.c.e.ClassPolymorphism;

//import a.b.c.e.ClassPolymorphism;
public class ClassDog {
	public static void main(String[] args) {
		
		
		
		
		System.out.println("test import ");
		
		a.b.c.e.ClassPolymorphism.printMessageForTest();
		
		
		Dog whiteDen=new Dog();
		
		whiteDen.name="denwu";
		whiteDen.color="white";
		
		whiteDen.GetDogInfo();
		
		System.out.println("*******************************");
		System.out.println(whiteDen);
		System.out.println(whiteDen.toString());
		System.out.println("*******************************");
		
		
		System.out.println("-------------------------------");
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("please input owner name of this dog: ");
		
		Dog dogDyn = new Dog(input.next());
		
		System.out.println("\ndog name = " + dogDyn.name + "\n    age = " + dogDyn.age);		
		
	}
}

class Dog	{

	String name;
	int age;
	String source;
	String color;
	String sex;
	
	//重写TOSTRING
	public String toString(Object obj)	{
		if (obj instanceof Dog)	{
			return ((Dog) obj).name;
		}
		else	{
			return "xxx";
		}
	}
	
	@Override
	public String toString()	{
		
			return (this.name + "     " + this.age);
		
	}
	
	//构造方法
	public Dog()	{
		name="greenhat";
		age=3;
		source="japan";
		color="white";
		sex="f";
	}
	
	//构造方法
	public Dog(String owner)	{
		switch (owner)
		{
		case "denise":
			this.name="denise's dog";
			this.age=4;
			this.source="japan";
			break;		
		case "winki":
			this.name="winki's dog";
			this.age=9;
			this.source="from europe";
			break;
		case "andy":
			this.name="andy's dog";
			this.age=77;
			this.source="korean";
		default:
			
		}
		
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void GetDogInfo	()	{
		
		System.out.println("this is dog ---- start");
		
		System.out.println("dog's name is: " + this.name);
		System.out.println("dog's color is: " + this.color);
		System.out.println("dog's age is: " + this.age);
		
		System.out.println("this is dog ---- end");
				
				
				
				
	}
	
}
