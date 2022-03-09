class wildCraftBag extends Bag{
int warrantyPeriod;
BagColor color;

wildCraftBag(int warrantyPeriod,BagColor color){
 super(true,BagType.LAPTOP,BagUser.MALE,1500);
 this.warrantyPeriod=warrantyPeriod;
 this.color=color;
System.out.println("warrantyPeriod and type of a bag");
}


}
