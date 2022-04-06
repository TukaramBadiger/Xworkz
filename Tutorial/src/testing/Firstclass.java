package testing;


public class Firstclass {
void teacher(String sub) {
	System.out.println(sub);

}
void teacher(int noOfPeriods) {
	System.out.println(noOfPeriods);

}
	
	void teacher(int fees,String name) {
		System.out.println(fees);

	}
	

	public static void main(String[] args) {


	
	Firstclass Class=new Firstclass();
	Class.teacher("Java");
	Class.teacher(25000,"Ram");
	Class.teacher(25);
	
	
	
	
	
	
	
	}
}
	
