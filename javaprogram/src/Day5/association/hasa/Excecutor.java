package Day5.association.hasa;

public class Excecutor {

	public static void main(String[] args) {
		Address address = new Address("jsks", "usj", "hddi", "6383993");
		Person person = new Person("hsks", address);
		person.displayInfo();
		// TODO Auto-generated method stub

	}

}
