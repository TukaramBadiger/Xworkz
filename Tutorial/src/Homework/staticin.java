package Homework;

public class staticin {


	static void fruit(String mango) {
		System.out.println(mango);
	}
	
static void fruit(int no) {
	System.out.println(no);
			
		}
static void fruit(String msg,int n) {
	System.out.println(msg+" "+n);
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticin.fruit("sweet");
        staticin.fruit(25);
        staticin.fruit("mango",50);
	} 

}