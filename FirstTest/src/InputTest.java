import java.util.Scanner;

public class InputTest {

		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in );
			 
			 System.out.print("please input string: ");
			 
			 String str=sc.next();
			 
			 System.out.println("you have inputted: " + str + " first char: " + str.charAt(0));
		 }
}
	
class InputNum	{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("First Num: ");
		int num1 = input.nextInt();
		
		System.out.println("Second Num: ");
		int num2 = input.nextInt();
		
		int numSum = num1+num2;
		
		System.out.println("Sum: " + numSum);
	}
}

class If1	{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("what's the age: ");
		
		int intAge = input.nextInt();
		
		if (intAge > 10 && intAge < 50)	{
			System.out.println("good health");
		}
			else if (intAge >4 && intAge <7)	{
				System.out.println("age");
			}
	
		String strName=input.next();
		if (strName.equals("abc"))
		{
			System.out.print("ok");
		}
		else
		{
			System.out.print("no ok");
		
		}
		
	}
	
}


 class Switch1	{
	 public static void main (String[] args)	{
		 String strName="bsb";
		 
		 switch (strName)	{
		 case "aa":
			 System.out.println("this is aa");
			  
		 case "bb":
			 System.out.println("this is bb");
			 break;
			 
			 
			 
		default:
				 System.out.println("xxx");
				 break;
		 }
	 }
	 
}
 
 class Loop1	{
	 public static void main(String[] args) {
		 
		 for (int i=2; i<7;i++)	{
			 System.out.print(i);
		 }
		 
		 int ii=10;
		 while(ii>1)	{
			 ii--;	 
			 System.out.println("while");
		 }
		 
	 }
 }
 
 
 class DoWhile1	{
	 public static void main(String[] args)	{
		 Scanner input = new Scanner(System.in);
		 String aa;
		 do {
			 System.out.println("are you satisified? ");
			 aa=input.next();
		 }	 while (aa.equals("y"));
	 }
 }