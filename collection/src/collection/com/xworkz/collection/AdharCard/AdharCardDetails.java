
package collection.com.xworkz.collection.AdharCard;

	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;

	public class AdharCardDetails {

	public static void main(String[] args) {
	Collection< Long> adharNumbers = new ArrayList<Long>();
	adharNumbers.add( 269676616249l);
	adharNumbers.add(265648576516l);
	adharNumbers.add(213564864654l);
	adharNumbers.add(767626263514l);
	adharNumbers.add(812465867947l);
	adharNumbers.add(232356567474l);
	adharNumbers.add(565685856565l);
	adharNumbers.add(457575465645l);
	adharNumbers.add(747475775576l);
    adharNumbers.add(959596969898l);
	int size = adharNumbers.size();
	System.out.println(size);

	boolean contains = adharNumbers.contains(adharNumbers);
	System.out.println(contains);

	Iterator<Long> iterator = adharNumbers.iterator();
	while (iterator.hasNext())
	{
	System.out.println(iterator.next());
	}


	}

	}
	
	


