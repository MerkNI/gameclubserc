public class Game {

    private String title;
    private int releaseYear;
    private Genre genre;

    public Game(String aTitle, int aReleaseYear, Genre aGenre) {

        this.title = aTitle;
        this.releaseYear = aReleaseYear;
        this.genre = aGenre;

    }



    public Genre getGenre() {

        return genre;
    }

    public int getReleaseYear() {

        return this.releaseYear;

    }

    public String getTitle() {

        return this.title;

    }

    public void displayDetails(){

        String displayDetails = this.getTitle() + ", " + this.getGenre() +", " + "release year: " + this.getReleaseYear();

        System.out.println(displayDetails);

    }
}
