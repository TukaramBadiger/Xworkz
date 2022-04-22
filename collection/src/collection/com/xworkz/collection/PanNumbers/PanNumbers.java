package collection.com.xworkz.collection.PanNumbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PanNumbers {
	
	
	
	
	public static void main(String[] aargs) {
		Collection<String> panNumbers=new ArrayList<>();
		
		panNumbers.add("EZEPB7661");
		panNumbers.add("RTHG2465");
		panNumbers.add("ASDF1545");
		panNumbers.add("ASAS1254");
		panNumbers.add("DFDF2545");
		panNumbers.add("DFRF2565");
		panNumbers.add("BNBN6565");
		panNumbers.add("TUTU4747");
		panNumbers.add("FGFG1254");
		
		
		int totalpan=panNumbers.size();
		System.out.println(totalpan);
		
		
		boolean contains = panNumbers.contains(panNumbers);
		System.out.println(contains);

		Iterator<String> iterator = panNumbers.iterator();
		while (iterator.hasNext())
		{
		System.out.println(iterator.next());
		}


		
		
		
	}
	

}
