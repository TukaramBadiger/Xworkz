class BagOperator{
void display(Bag bag){
	
    System.out.println(bag.price);
	
	if(bag instanceof wildCraftBag){
		wildCraftBag wild=(wildCraftBag)bag1;
		    System.out.println(wild.warrantyPeriod);
		    System.out.println(wild.color);

	}
	if(bag instanceof AmericanTouristerBag){
			AmericanTouristerBag casted2=(AmericanTouristerBag)bag2;
			    System.out.println(casted2.noOfComapartments);
			    System.out.println(casted2.wallet);

	}
}

}
