package Day2;

public class operatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int x = 10;
		System.out.println(" before operation of a and b");
		++a;
		int c = ++a + b + a--;
		System.out.println("c value after operation:" +c);
		int d = c++ + a + b--;
		System.out.println("d value after operation:" +d);
		System.out.println("a,b,c,d value after operation:" +a+ ""+b+""+c+""+d);
		x = (10 == x) ? 1 : 0;
		System.out.println(x);

	}

}
