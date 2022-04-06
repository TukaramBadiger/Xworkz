package Homework;
class countrycode{
	public static String countrycde(String code){
		if (code=="+91")
		{
			System.out.println("country is");
			return "INDIA";
		}
		if (code=="+92")
		{
			System.out.println("country is");
			return "Pakistan";
		}
		if (code=="+93")
		{
			System.out.println("country is");
		return "Afghanistan";
		}
		if (code=="+7")
		{
		System.out.println("country is");
		return 	"russia";
		}
		if (code=="+213") {
			System.out.println("country is");
		return "Algeria";
		}
		if(code=="+62") {
			System.out.println("country is");
		return "Indonesia";
		}
		if (code=="+62") {
			System.out.println("country is");
		return "Iran";
		}
		return "unknown country";
		}
		}
		class pincode{
			public static void main(String[] args){
				String code=countrycode.countrycde("+91");
				System.out.println(code);
			}
		}