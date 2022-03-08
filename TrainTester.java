class TrainTester{
public static void main(String[] args){

//Train train=new displayDetails();
//train.displayDetails();

Train train1=new Train(231654);
System.out.println(train1.trainNo);

Train train2=new Train(258465,"shabdavedi");
System.out.println(train2.trainNo);
System.out.println(train2.trainName);

Train train3=new Train(Fuel.COAL);
System.out.println(train3.fuelType);

Train train4=new Train(Fuel.ELECTRIC,"Shatabdi");
System.out.println(train4.fuelType);
System.out.println(train2.trainName);


MetroTrain metro1=new MetroTrain("Bangalore","Namma metro",Fuel.ELECTRIC);
	System.out.println("CityName "+metro1.cityName);
		System.out.println("train Name "+metro1.trainName);
		System.out.println("train Name "+metro1.fuelType);

MetroTrain metro2=new MetroTrain(250,56456);
		System.out.println("price of ticket "+metro2.ticketPrice);
				System.out.println("Train No"+metro2.trainNo);

MetroTrain metro3=new MetroTrain("Belagaum",25654,"Chennamma Express");
		System.out.println("price of ticket "+metro3.trainNo);
	System.out.println("train Name "+metro3.trainName);
	System.out.println("CityName "+metro3.cityName);


}
}