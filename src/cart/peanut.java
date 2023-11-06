package cart;

public class peanut {

	public static void main(String[] args) {
		peanut walnut= new peanut();
		walnut.almond();
		peanut.rose();
		walnut.light(8000, 9000);
       
	}
	public int almond() {
   int a=800;
   System.out.println(a);
   return a;
   
	}
	public static int rose() {
		int b=5000;
		System.out.println(b);
		return b;
	}
	public int light(int a,int b) {
	int c=a+b;
	System.out.println(c);
	return c;
	}

}
