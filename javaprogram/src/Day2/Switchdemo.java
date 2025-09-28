package Day2;

public class Switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x ='l';
		switch(x) {
		case 'l':
		case 'L':
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a digit");
			break;
		default:
			System.out.println(x+" is a other digit");
		}

	}

}
