package testing;

public class trapezoid {
	static void trapezoid() {
		int verticleheight=20;
		double parallelsideA=20.5;
		double parallelsideB=30.5;
		double parallelside=parallelsideA+parallelsideB;
		double Area=0.5*parallelside*verticleheight;
		System.out.println(Area);
	}
	public static void main(String[] args) {
		System.out.println("Area of trapezoid");
		trapezoid();
		
	}

}