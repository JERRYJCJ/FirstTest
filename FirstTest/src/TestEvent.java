import java.util.Scanner;
public class TestEvent {
	public static void main(String[] args) {
		System.out.println("this is from main");
		
		System.out.println(isJavaTest());
		
		TestEvent.isJavaTest();
			
		System.out.println("");
	
	}
	
	public static  boolean isJavaTest()	{
		Scanner input=new Scanner(System.in);
		System.out.println("this is from local event");
		
		String strTest=input.next();
		
		if (strTest.equals("abc"))	{
			System.out.println("true");
			return true;
		}
		else
			System.out.println("false");
			return false;
	}
}


class TestEvent2	{
	public static void main(String[] args) {
		System.out.println("call event 1 " );
		TestEvent.isJavaTest();
	}
}