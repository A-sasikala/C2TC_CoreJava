package day6.usingfinal;
final class FinalClass{
	void show() {
	System.out.println("Final class cannot be inherited");
	}
	}
	//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner,Number are Final classes


public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass f1 = new FinalClass(); // Call show() method using objectreference variable ab.
		f1.show();
				
	}
}

			