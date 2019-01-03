/**
 * 
 */
package ExceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.processing.FilerException;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//
//		try {
//			FileInputStream fStream = new FileInputStream("c:/abc.txt");
//		} 
//
//
//		catch(FileNotFoundException e)	{
//			System.out.println("File Expection...");
//			e.printStackTrace();
//		}
//		catch(IOException e)	{
//			System.out.println("IO Expection...");
//			e.printStackTrace();
//		}
//		
//		
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Exception...");
//			e.printStackTrace();
//			
//		}
		
		
		try {
			System.out.println(ReturnAge());
		} catch (FilerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(AgeOutOfException e) {
			System.out.println("catch age error");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("this is final statement11");
		}
	}
	
	
	public static int ReturnAge()	throws FilerException, AgeOutOfException  {
		System.out.println("this is sub event");
		try {
			int a=3;
			int b=0;
			return a/b;
		}
		catch(Exception e)	{
			System.out.println("error-----------" + e.getMessage());
			
		}
		
		finally {
			
			System.out.println("finally here");
			
			
		}
		
		AgeOutOfException ageOutOfException=new AgeOutOfException("this is age out of error");
		
		throw ageOutOfException;
	}
}
