package a.b.c.e;

/*
 * those commented items is to explain the original inherit class & events. 
 */

/*
class Pets
{
	String category;
	String name;
	String color;
	String age;
	
	public int PetsPrice()	{
		
		try
		{
			System.out.println("this is parent class: PETS, name is:     " + this.name);
			
			switch(category)	{
			
			case "cat": 
				System.out.println("CAT");
				return 100;
				
				//break;
				
			case "dog":
				System.out.println("Be careful!: DOG");
				return 12345;
				
				//break;
				
			default:
				System.out.println("unknown");
				
				return -999;
				
			}
			
		}
		
		catch(Exception e)	{
			System.out.println("ALERT: error here ******   getMessage: " + e.getMessage() + "       toString: " + e.toString() + "     getStackTrace: " + e.getStackTrace());
		
			System.out.println("----------------------------------------------------");
		//	e.printStackTrace();
			System.out.println("----------------------------------------------------");
			
			return 0;
		}

		
		
	}
}


class PetDog extends Pets	{
	boolean isKillPerson;
	double voiceNum;
	
	public int PetsPrice()	{
		return super.PetsPrice();
	}
	
}


class PetCat extends Pets	{
	boolean isCatIll;
	double sleepHours;
	
	public int PetsPrice()	{
		return 333;
	}
}

public class ClassPolymorphism {
	public static void main(String[] args) {
		System.out.println("main event - starting -----");
		
		PetDog ThisIsDog = new PetDog();
		PetCat ThisIsCat = new PetCat();
		
	
		ThisIsDog.category="dog";
		ThisIsDog.name = "WangWang";
		ThisIsDog.isKillPerson=true;
		System.out.println("Dog's price is: " + ThisIsDog.PetsPrice());
		
		
		ThisIsCat.category="cat";
		ThisIsCat.name="MiaoMiao";
		ThisIsCat.isCatIll=false;
		System.out.println("Cat's price is: " + ThisIsCat.PetsPrice());
		
	}
}


*/




class Pets
{
	String category;
	String name;
	String color;
	String age;
	
	public int PetsPrice()	{
		
		try
		{
			System.out.println("this is parent class: PETS, name is:     " + this.name);
			
			switch(category)	{
			
			case "cat": 
				System.out.println("CAT");
				return 100;
				
				//break;
				
			case "dog":
				System.out.println("Be careful!: DOG");
				return 12345;
				
				//break;
				
			default:
				System.out.println("unknown");
				
				return -999;
				
			}
			
		}
		
		catch(Exception e)	{
			System.out.println("ALERT: error here ******   getMessage: " + e.getMessage() + "       toString: " + e.toString() + "     getStackTrace: " + e.getStackTrace());
		
			System.out.println("----------------------------------------------------");
		//	e.printStackTrace();
			System.out.println("----------------------------------------------------");
			
			return 0;
		}

		
		
	}
}


class PetDog extends Pets	{
	boolean isKillPerson;
	double voiceNum;
	
	
	public int PetsPrice()	{
		//return super.PetsPrice();
		return 777;
	}
	
	public void DogSwim()	{
		System.out.println("Dog is swimming");
	}
	
}


class PetCat extends Pets	{
	boolean isCatIll;
	double sleepHours;
	
	
	public int PetsPrice()	{
		return super.PetsPrice();
	}
	
	
	public void CatPlay()	{
		System.out.println("Cat is playing...");
	}
}

public class ClassPolymorphism {
	
	public static void printMessageForTest()	{
		System.out.println("this is from class abcde....");
	}
	
	public static void main(String[] args) {
		System.out.println("main event - starting -----");
		
		Pets ThisIsDog = new PetDog();
		Pets ThisIsCat = new PetCat();
		
		ThisIsDog.category="dog";
		ThisIsDog.name = "WangWang";
		//ThisIsDog.isKillPerson=true;
		System.out.println("Dog's price is: " + ThisIsDog.PetsPrice());
		
		
		ThisIsCat.category="cat";
		ThisIsCat.name="MiaoMiao";
		//ThisIsCat.isCatIll=false;
		System.out.println("Cat's price is: " + ThisIsCat.PetsPrice());
	
		Pets ThisIsPet =new Pets();
		
		
		
		if (ThisIsDog instanceof PetDog)	{
			
			PetDog PetIsDog = (PetDog) ThisIsDog;
			PetIsDog.category="dog";
					
			PetIsDog.DogSwim();
			System.out.println("New Dog's price is: " + PetIsDog.PetsPrice());
		}
		
		if ((ThisIsCat instanceof PetCat)) {
			PetCat PetIsCat = (PetCat) ThisIsCat;
			PetIsCat.CatPlay();
			System.out.println("New Cat price is: " + PetIsCat.PetsPrice());
		}
		
		PetCat PetIsCat = (PetCat) ThisIsCat;
		
		PetIsCat.CatPlay();
		
		
		
		double aa=1.23;
		int bb=0;
		
		aa=bb;
		bb=(int) aa;
		
	}
}

