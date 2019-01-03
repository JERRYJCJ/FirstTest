
public class ClassInherit {
	public static void main(String[] args)	{
		
		/*
		DogDog dogTest =new DogDog();
		dogTest.name="gigi";
		dogTest.dogSource="taiwan";
		dogTest.printInfo();
		
		Cat catTest=new Cat();
		catTest.name="kiki";
		catTest.catSource="jakarta";
		catTest.printInfo();
		
		System.out.println("dog: " + dogTest.name);
		System.out.println("cat: " + catTest.name);
		
		*/
		

		BasicInfo dogHere = new BasicInfo();
		BasicInfo dogThere = new DogDog();
		BasicInfo catHere=new Cat();
		
		dogHere.name="Here";
		dogHere.printInfo();
		
		System.out.println("-------------------------------------");

		dogThere.name="There";
		dogThere.printInfo();
		
		System.out.println("-------------------------------------");

		catHere.name="cat";
		catHere.printInfo();
	}

	public static void testHere()	{
		
	}

}


class BasicInfo	{
	String name;
	String gender;
	String age;
	int testHere;
	 
	public  void printInfo()	{
		String name;
		name="name has been changed;";
		System.out.println("this is parent class: name is " + this.name + " gender is " + this.gender);
	}
 
	
}

class DogDog extends BasicInfo	{
	
	String dogSource;
	//String name;

	//overwrite
	@Override
	public  void printInfo( )	{
		 super.printInfo();
		System.out.println("this is DOG child class - inside dog: " + super.name  + "   child class variable: dogsource = " + this.dogSource);
	}
	
}


class Cat extends BasicInfo	{
	String catSource;
	

	public  void printInfo()	{
		String name;
		name="cat cat;";
		System.out.println("this is CAT child class: name is " + this.name + " gender is " + this.gender);
	}
}