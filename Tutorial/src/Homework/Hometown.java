package Homework;

public class Hometown {
	public void place() {
		int no=125;
		int distance=25;
		System.out.println("print something "+no+" "+distance);
		
	}
public void place(int no,String placeName) {
System.out.println("just println "+no);
System.out.println("print "+placeName);
	
}
public int place(int m,char t) {
	System.out.println("write no"+m+t);
	return t;
	}
public static void main(String[] args) {
	Hometown p=new Hometown();
	p.place();
	p.place(75,"Nandeshwar");
	p.place(25,'a');
}
}
