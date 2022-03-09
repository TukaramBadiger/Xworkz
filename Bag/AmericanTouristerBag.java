class AmericanTouristerBag extends Bag{
boolean wallet;
int noOfComapartments;

AmericanTouristerBag(boolean wallet,int noOfComapartments){
super(false,BagType.COLLAGE,BagUser.FEMALE,2000);
this.wallet=wallet;
this.noOfComapartments=noOfComapartments;
	System.out.println("american bag");
}

}