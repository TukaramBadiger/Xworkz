package collection.com.xworkz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IplTeam {
	public static void main(String[] args) {
	Map<String, String> IplTeamAndCaptain=new HashMap<>();
	IplTeamAndCaptain.put("RCB", "Kohli");
	IplTeamAndCaptain.put("CSK", "Dhoni");
	IplTeamAndCaptain.put("KKR", "Shreyas");
	IplTeamAndCaptain.put("MI", "Rohit");
	IplTeamAndCaptain.put("Punjab", "Agarwal");
	IplTeamAndCaptain.put("DC", "Pant");
	IplTeamAndCaptain.put("GT", "Hardik");
	IplTeamAndCaptain.put("LSG", "Rahul");
	IplTeamAndCaptain.put("GL", "Raina");
	IplTeamAndCaptain.put("RPS", "Smith");
	IplTeamAndCaptain.put("SRH", "Williumson");
	IplTeamAndCaptain.put("RR", "Samsun");
	IplTeamAndCaptain.put("PWI", "Yuvraj");
	
	System.out.println("total ipl teams "+IplTeamAndCaptain.size());
	System.out.println("");
	
	System.out.println("Ipl Team Names");
	Set<String> ipl=IplTeamAndCaptain.keySet();
	ipl.forEach(Team->System.out.println(Team));
	
	System.out.println("");
	System.out.println("Ipl team captain Names");
	Collection<String> values=IplTeamAndCaptain.values();
	values.forEach(Captain->System.out.println(Captain));
	
	System.out.println("");
	Set<Entry<String,String>> read=IplTeamAndCaptain.entrySet();
	read.forEach(iplTeam->System.out.println(iplTeam));

	System.out.println("");
	IplTeamAndCaptain.forEach((IplTeam,Captain)->System.out.println(IplTeam+" "+Captain));
	
	
	
	
	
	
	
	
	
	}

}
