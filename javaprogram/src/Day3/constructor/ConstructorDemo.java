package Day3.constructor;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String city;
		int id;
		System.out.print("enter person id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.print("enter person neme: ");
		name = sc.nextLine();
		
		System.out.print("enter person city: ");
		city = sc.nextLine();
		
		System.out.println(" ");
		Customer c = new Customer();
		c.setCustomerName(name);
		c.setCustomerId(id);
		c.setCustomerCity(city);
		System.out.println(c);
		
		System.out.print("enter person id: ");
		id = sc.nextInt();
		
		
		sc.nextLine();
		System.out.print("enter person neme: ");
		name = sc.nextLine();
		
		System.out.print("enter person city: ");
		city = sc.nextLine();
		
		
		
		//Customer c=new Customer(name, id, city);
		//System.out.println(c1);
		
		sc.close();
		
		
	
		
		

	}

}
