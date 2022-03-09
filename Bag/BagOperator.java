class BagOperator{
void display(Bag bag){
	if(bag instanceof Bag){
    System.out.println(bag.price);
	}
	else{
		System.out.println("bag is not instance of bag");
	}
}
void display(Bag bag1,String name){
	if(bag1 instanceof wildCraftBag){
		wildCraftBag wild=(wildCraftBag)bag1;
		    System.out.println(wild.warrantyPeriod);
		    System.out.println(wild.color);

	}
}
	void display(Bag bag2,int no){
		if(bag2 instanceof AmericanTouristerBag){
			AmericanTouristerBag casted2=(AmericanTouristerBag)bag2;
			    System.out.println(casted2.noOfComapartments);
			    System.out.println(casted2.wallet);

		}
	}

}