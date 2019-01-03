package InterfaceTest;

import javax.swing.plaf.basic.BasicRootPaneUI;

public class Test {
	public static void main(String[] args) {
		Flyable flyable;
		
		flyable=new Bird();
		flyable.fly();
		
		flyable=new Plane();
		flyable.fly();
		
	}
}
