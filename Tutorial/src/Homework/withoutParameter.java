package Homework;

public class withoutParameter {
	public static void main(String[] args){
		System.out.println("person Name and Age");
		person.nameAge();
		System.out.println(" ");
		System.out.println("Academic Details");
		person.academics();
		System.out.println(" ");
		System.out.println("Family Details");
		person.family();
		System.out.println(" ");
		System.out.println("general Deatils");
		person.general();
		System.out.println(" ");
		System.out.println("personal Details");
		person.personal();
		}
		}
		class person{
			public static void nameAge(){
				String name="Ram";
				String age="25 years";
				System.out.println("Name = "+name);
				System.out.println("Age = "+age);
			}
		public static void academics(){
			String name="Ram";
		    String branch="Mechanical";
			String collageName="B G M I T Mudhol";
			String favSubject="Design Of machines";
			String percentage="65%";
			System.out.println("Branch - "+branch);
			System.out.println("Collage Name - "+collageName);
			System.out.println("Faverite Subject- "+favSubject);
			System.out.println("Percentage= "+percentage);
		}
		public static void family(){
			String fatherName="Basavant";
			String motherName="Ratnabayi";
			System.out.println("Father Name="+fatherName);
			System.out.println("Mother Name="+motherName);
		}
		public static void general(){
			long adharNo=269676616249l;
			long mobileNo=8050167475l;
			System.out.println("Adhar No= "+adharNo);
			System.out.println("Mobile No= "+mobileNo);
		}
		public static void personal(){
			String maritalStatus="Unmarried";
			System.out.println("Marital Status= "+maritalStatus);
		}
		}


