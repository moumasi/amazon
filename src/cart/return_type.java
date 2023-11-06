package cart;

public class return_type {

	public static void main(String[] args) {
		return_type red= new return_type();
		red.air();
		red.pencil();
		red.pen(20.12);
		red.color('n');
		red.pink("Zafor", " Tanvir");

	}
	public double air() {
		double a=10.25;
		System.out.println(a);
		return a;
	}
	public char pencil() {
		char HR='k';
		System.out.println(HR);
		return HR;
	}
	public void pen(double a) {
		System.out.println(a);
	}
	public void color(char myname) {
		System.out.println(myname);
	}
	public void pink(String firstname , String lastname) {
		String fullname=firstname+lastname;
		System.out.println(fullname);
	}

}
