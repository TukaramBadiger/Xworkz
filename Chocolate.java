class Chocolate
{
double money=100.0;//0
double chocolatePrice=10.0;
double fixMoney=money;



void buy(int noOfChocolates)//5
{


//if(noOfChocolates*chocolatePrice<=money ){
	      double tempMoney=noOfChocolates * chocolatePrice;//50
     double amount=this.money-tempMoney;//50

System.out.println("purchasing chocolate "+noOfChocolates);
if(fixMoney>=tempMoney){
	System.out.println("we can buy no of chocolates");
	double m=this.money/chocolatePrice;
 System.out.println(" Still we can buy no of "+m+"chocolates");

}
else{
			//System.out.println("we canot buy extra chocolates ");

	double n=fixMoney/chocolatePrice;
	System.out.println("we can buy exactly no of chocolates");
		//System.out.println("we canot buy extra chocolates "+n);

}






}


}
