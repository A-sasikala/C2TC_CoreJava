package Day3.scannerdemo;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("enter person neme: ");
		name = ob.next();
		
		System.out.println("enter person age: ");
		int age = ob.nextInt();
		
		System.out.println("enter person gender: ");
		String gender = ob.next();
		
		System.out.println("enter taxable income: ");
		int income = ob.nextInt();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("after calculating tax:");
		System.out.println(person);
		ob.close();
		
		

	}

}
