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



HorrorMovies horrormovie=new HorrorMovies();
horrormovie.DisplayDetails();
horrormovie.collection(5000000);



}
}

//super actionMovie.duration;

