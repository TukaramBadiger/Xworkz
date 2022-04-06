package Homework;

 class testing{
void videocall(String duration,String quality) {
	System.out.println("total duration"+" "+duration);
	System.out.println("quality"+" "+quality);
	}

void videocall(int participents,String names) {
	System.out.println(participents);
	System.out.println(names);
	
}}
public class software {

public static void main(String[] args) {
	testing v=new testing();
	v.videocall("60 min", "good");
	System.out.println("total video call members");
	v.videocall(1, "tukaram");
	v.videocall(3, "vishwanath");
v.videocall(5, "teju");
}
}