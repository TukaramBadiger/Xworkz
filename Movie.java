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


