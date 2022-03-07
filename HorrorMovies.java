class HorrorMovies extends Movie{
String movieName;
String director;
double duration;

void DisplayDetails(){
System.out.println(" Movie Name "+movieName);
System.out.println(" Movie director "+director);
System.out.println(" Movie duration "+duration);
 System.out.println(super.movieName);
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
