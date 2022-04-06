package Homework;

class multi{
	String name="Ram";
	int age=25;
	void work(){
	System.out.println("Searching Jobs");
	
}
}
class multi1 extends multi{
	String n="teju";
	String location="Bangalore";
	void job() {
		System.out.println("Learning java from online");
		
	}
}
class multi2 extends multi1{
	String m="vishwa";
	int age=30;
	void vish() {
		System.out.println("teaching java and selenium");
		
	}
}
class multi3 extends multi2{
	String name="vijay";
	int Age=30;
	void viju() {
		System.out.println("no work simly sitting");
		
	}
}
public class multilevel {
public static void main(String[] args) {
	multi3 M=new multi3();
	M.viju();
	M.vish();
	M.job();
	System.out.println(M.m);
	System.out.println(M.age);
	System.out.println(M.Age);
	System.out.println(M.n);
	System.out.println(M.location);
	System.out.println(M.name);

}
}