class MetroTrain extends Train{
String cityName;
double ticketPrice;

MetroTrain(String cityName,String trainName,Fuel fuelType){
super(fuelType,trainName);
this.cityName=cityName;
	System.out.println("CityName "+cityName);
		System.out.println("train Name "+trainName);

}

MetroTrain(double ticketPrice,int trainNo){
	super(trainNo);
	this.ticketPrice=ticketPrice;
		System.out.println("price of ticket "+ticketPrice);
				System.out.println("Train No"+trainNo);

}
MetroTrain(String cityName,int trainNo,String trainName){
	super(trainNo,trainName);
	
	this.cityName=cityName;
		System.out.println("price of ticket "+trainNo);
	System.out.println("train Name "+trainName);
	System.out.println("CityName "+cityName);

	
}
}