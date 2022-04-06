package Homework;





class Movie{
String movieName="Mungaru Male";
String mainLeadMale="Ganesh";
double duration=130;
double investment=7000000.0;
double collection=750000000.0;
double ratings=4.5;

void displayDetails(){
System.out.println("Movie Name "+movieName);
System.out.println("Movie Main Lead Male "+mainLeadMale);
System.out.println("Movie duration "+duration);
System.out.println("Movie investment "+investment);
System.out.println("Movie collection "+collection);
System.out.println("Movie ratings "+ratings);
}
    
   void rating(int rate){
   if (rate>3.5){
   System.out.println("good Movie");
   }
   if(rate<3.5 && rate>2.5){
   System.out.println("Average Movie");
   }
   else{
   System.out.println("not good");
   }
   }
   

}
class HorrorMovies extends Movie{
String name;
String director;
double duration;

void Display(){
System.out.println(" Movie Name "+name);
System.out.println(" Movie director "+director);
System.out.println(" Movie duration "+duration);
 
 }
 void collection(double profit){
 if(profit>100000){
 System.out.println("average Movie");
 }
 if(profit>100000000){
 System.out.println("hit movie");
 }
 }
 }
class ActionMovie extends Movie{

String movieName;
String director;

void display(){
System.out.println("Movie Name "+movieName);
System.out.println("Movie director "+director);
}
 void actionParam(String movieName,String director){
 
System.out.println("Movie Name "+movieName);
System.out.println("Movie director "+director);
}
}




class single1{
	class MovieTester{
		public static void main(String[] args){

		Movie movie=new Movie();
		movie.displayDetails();
		movie.rating(4);


		ActionMovie actionMovie=new ActionMovie();
		actionMovie.movieName="K G F Chapter1";
		actionMovie.director="prashant Neel";
		actionMovie.display();
		actionMovie.actionParam("Bahubali","S S Rajmouli");
		System.out.println(actionMovie.duration);
		}
		}
}

		//super actionMovie.duration;

