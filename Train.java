class Train{
int trainNo;
String trainName;
Fuel fuelType;


void displayDetails(){
System.out.println(trainNo);
System.out.println(trainName);
System.out.println(fuelType);

}
Train(int trainNo){
this.trainNo=trainNo;
System.out.println("Train no");
} 
Train(int trainNo, String trainName){
this.trainNo=trainNo;
this.trainName=trainName;
System.out.println("train Details");
//System.out.println(trainName);
}
Train(Fuel fuelType){
this.fuelType=fuelType;
System.out.println("fuelType");
}
Train(Fuel fuelType,String trainName){
this.fuelType=fuelType;
this.trainName=trainName;
//System.out.println(fuelType);
System.out.println("trainName");
}
}