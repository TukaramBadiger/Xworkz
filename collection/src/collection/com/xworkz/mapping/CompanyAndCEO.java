package collection.com.xworkz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompanyAndCEO {
	public static void main(String[] args) {
		Map<String , String> CEOAndCompany=new HashMap<>();
		CEOAndCompany.put("google", "Sundar");
		CEOAndCompany.put("FaceBook", "Mark");
		CEOAndCompany.put("Accenture", "Julie Sweet");
		CEOAndCompany.put("Adobe", "Shantanu");
		CEOAndCompany.put("Airbus", "Armen");
		CEOAndCompany.put("Amazon", "Andy jassy");
		CEOAndCompany.put("Apple", "Tim Cook");
		CEOAndCompany.put("BMW", "Oliver Zipse");
		CEOAndCompany.put("Boeing", "Dave CalHoun");
		CEOAndCompany.put("Capgemini", "Aiman Ezzat");
		CEOAndCompany.put("Ford", "James Hacket");
		CEOAndCompany.put("HCL", "VijayShankar");
		CEOAndCompany.put("Infosys", "Salil Parekh");
		CEOAndCompany.put("Kodak", "Jeff clarke");
		CEOAndCompany.put("MicroSoft", "Satye Nadella");
		CEOAndCompany.put("Nokia", "Pekka Lundmark");
		
		
		
		System.out.println("total companies "+CEOAndCompany.size());
		System.out.println(" ");
		
		System.out.println("company names");
        Set<String> company=CEOAndCompany.keySet();
        company.forEach(Company->System.out.println(Company));
        
        System.out.println(" ");
        Collection<String> ceo=CEOAndCompany.values();
       ceo.forEach(CEO->System.out.println(CEO));
       
       System.out.println("");
       Set<Entry<String ,String>> read=CEOAndCompany.entrySet();
       read.forEach(CompanyAndCeo->System.out.println(CompanyAndCeo));
		
		
		System.out.println(" ");
		CEOAndCompany.forEach((Company,CEO)->System.out.println(Company+" "+CEO));
		
		
		
	}

}
