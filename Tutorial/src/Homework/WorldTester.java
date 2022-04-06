package Homework;
/*Write a Program to add, find,update,delete and display Country
1. Name is not null, min chars is 3 , max chars is 50 
2. Name should not be null 
3. Add max of 20 Countries
4. Do not duplicate country 
5. Check index exists before update 
void add(String country);
boolean find(String country);
void display();
update(int index,String country);
delete(int index);
delete(String country)
*/
class World {
String value;
String[] countryName=new String[20];
int temp=0;
void addCountryName(String countryName)
{
	if(temp<countryName.length())
	{
if(countryName.length()>=3 && countryName.length()<=50 && countryName!=null)
{
this.countryName[temp]=value;
this.temp++;
}

else{
	System.out.println("print error");
}
}
}
boolean found(String country)
{
	boolean found=false;
	for(int i=0;i<this.countryName.length;i++){
		String value=this.countryName[i];
		if(value.equals(country));
		{
			System.out.println("coutry found"+" "+country);
			found=true;
		}
		if(!found){
			
			System.out.println("Contry is not found"+" "+country);
			}
		}
	     return true;
		
	}

void displaycountryName(){
	for(int c=0;c<countryName.length;c++)
	{
		System.out.println(countryName[c]+" "+c);
	}
}

//update(int index,String country){
	




}
class WorldTester{
public static void main(String[] args){
World country=new World();
country.addCountryName("India");
country.addCountryName("pakistan");
country.addCountryName("Russia");
country.addCountryName("Ukrain");
country.addCountryName("America");
country.addCountryName("Japan");
country.addCountryName("Srilanka ");
country.addCountryName("Dubai");
country.addCountryName("Afhanistan");
country.addCountryName("Bhutan");
country.addCountryName("parsia");
country.addCountryName("South Africa");
boolean countryName=country.found("Bhutan");
System.out.println(countryName);
country.displaycountryName();
}
}