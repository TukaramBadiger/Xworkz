package Homework;

public class instagram {
	static void upload(String reels,int size,String photo) {
		System.out.println(reels);
		System.out.println(size);
		System.out.println(photo);
		
	}
	static void upload(int size, String msg)
	{
		System.out.println(size);
		System.out.println(msg);
	}
	static void upload(String photo,String post) {
		System.out.println(photo+" "+post);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
instagram.upload("sing", 20,"nature");
instagram.upload(25, "love you");
instagram.upload("animal","reels");
	}

}
