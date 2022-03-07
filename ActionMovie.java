class ActionMovie extends Movie{

String movieName;
String director;

void display(){
System.out.println("Movie Name "+movieName);
System.out.println("Movie director "+director);
 System.out.println(super.movieName);

}
 void actionParam(String movieName,String director){
 
System.out.println("Movie Name "+movieName);
System.out.println("Movie director "+director);
}
}