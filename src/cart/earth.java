package cart;

public class earth {

	public static void main(String[] args) {
  earth.yellow();
  earth.pink();
  earth.red();
  earth.green();
  earth.forest(450, 750);
  earth.water(30.20, 45.12);
  earth.table("Tantawi", " Araab");
	}
	public static double yellow() {
		double x=20.45;
		System.out.println(x);
		return x;
	}
	public static char pink() {
		char city='h';
		System.out.println(city);
		return city;
	}
	public static String red() {
		String x="Aayat";
		System.out.println(x);
		return x;
	}
	public static int green() {
		int a=9000;
		System.out.println(a);
		return a;
	}
	public static void forest(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	public static void water(double a, double b) {
		double d=a*b;
		System.out.println(d);
	}
	public static void table(String x, String y) {
		String z=x+y;
		System.out.println(z);
	}

}
