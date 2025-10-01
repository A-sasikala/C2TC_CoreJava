package day4.thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m=Myclass.getObject();
		m.setId(10);
		
		Myclass m1=Myclass.getObject();
		
		System.out.println(m);
		System.out.println(m1);


	}

}
