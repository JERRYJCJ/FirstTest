
//方法重载, 同一个类里面的方法一样，但是参数不同 

public class Method1 {

	public static void main(String[] args) {
		System.out.println(maxNum(3,5));
		
		System.out.println(maxNum(6,3.5));
		
		System.out.println(maxNum());
		
		System.out.println(maxNum("hello world"));
	}
	
	public static int maxNum(String a) {
		System.out.println("this is to handle string");
		return -1;
	}
	
	public static int maxNum(int a, int b) {
		System.out.println("this is to handle integer");
		return a>b?a:b;
	}
	
	public static int maxNum()	{
		System.out.println("this is to handle empty parameter");
		return 0;
	}
	
	public static double maxNum(double aa, double bb) {
		System.out.println("this is to handle double ");
		return aa > bb? aa : bb;
	}
}
