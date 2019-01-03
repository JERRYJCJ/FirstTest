import java.sql.Time;
import java.util.Date;

class Habbit	{
	boolean playBasketball;
	boolean playFootball;
	
	public  String LikeorUnlike() {
		
		if (playBasketball==true)	{
			return "I like NBA";
		}
		else
		{
			return "dont like";
		}
	}
}

class Student	{	
	//Attribute  Ù–‘	;
	String name;
	String age;
	String gender;
	String title="Mr.";
	
	String favoriteColor;
	
	Habbit habbit=new Habbit();
}

class City	{
	String cityNo;
	public String getCityNo() {
		return cityNo;
	}
	public void setCityNo(String cityNo) {
		this.cityNo = cityNo;
	}
	static String cityName="hong kong";
}

public class ClassTest {
	
	
	public static void printFirst()	{
		
		Time timeNow = new Time(0);
		Date dteNow=new Date();
		
		System.out.println("static function" + dteNow.toString());
	}
	
	public void printSecond()	{
		System.out.println("non-static function");
	}
	
	public static void main(String[] args) {
		
		
		printFirst();
		
		ClassTest classHere = new ClassTest();
		classHere.printFirst();
		classHere.printSecond();
		
		System.out.println("-------------------------------------------------------");
		
		
		City cityTest = new City();
		cityTest.cityNo ="no. of gz";
		cityTest.cityName="this is guang zhou";
		
		
		System.out.println("city no: " + cityTest.cityNo);
		System.out.println("city name: " + cityTest.cityName);
		
		City.cityName="guang zhou";
		System.out.println(City.cityName);
		

		System.out.println("city no: " + cityTest.cityNo);
		System.out.println("city name: " + cityTest.cityName);

		
		Student gzStudent=new Student();
		
		gzStudent.name="jerry jiang";
		gzStudent.title ="Ms.";
		
		
		gzStudent.habbit.playBasketball=false;
		
		System.out.println(gzStudent.habbit.LikeorUnlike());
	}
}

class VarTest	{
	int price=111;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void aaa()	{
		
		System.out.println("in function 00 = " + price);
		
		int price = 222;
		
		System.out.println("in function aaa1 = " + this.price);
		System.out.println("in function aaa2 = " + price);
	}
	public void bbb()	{
		
		price=333;
	}
}


class VarPrint	{
	public static void main(String[] args) {
		VarTest testa=new VarTest();
		
		testa.price =-999;
		testa.aaa();
		
		testa.bbb();
		
		System.out.println("variable final = " + testa.price);
		
		VarTest testb=new VarTest();
		//testb.price =12345;
		testb.aaa();
		
	}
	
	
}