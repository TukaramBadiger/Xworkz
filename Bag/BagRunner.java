class BagRunner{
public static void main(String[] args){
Bag bag=new Bag(true,BagType.LAPTOP,BagUser.MALE,3000);

Bag bag1=new wildCraftBag(2,BagColor.BLACK);

Bag bag2=new AmericanTouristerBag(false,3);

System.out.println(bag.type);

System.out.println(bag1.gender);
System.out.println(bag2.price);


BagOperator operator=new BagOperator();
operator.display(bag);
operator.display(bag1);
operator.display(bag2);

}
}
