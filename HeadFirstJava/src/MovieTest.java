
class Movie{
	String title;
	String genre;
	int rating;
	
	void playMovie(){
		System.out.println("Movie Playing............");
	}
}
public class MovieTest {

	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the wind";
		one.genre = "Tragic";
		one.rating = 60;
		
		Movie two = new Movie();
		two.title = "Sherlock";
		two.genre = "Uplifting";
		two.rating = 80;
		two.playMovie();
		
		Movie three = new Movie();
		three.title = "Prison Break";
		three.genre = "Comedy";
		three.rating = 90;

	}

}
