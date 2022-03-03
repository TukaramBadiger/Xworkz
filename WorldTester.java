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