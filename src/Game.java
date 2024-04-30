public class Game {

    private String title;
    private int completionTime;
    private Genre genre;

    public Game(String aTitle, int aCompletionTime, Genre aGenre) {

        this.title = aTitle;
        this.completionTime = aCompletionTime;
        this.genre = aGenre;

    }

    public Genre getGenre() {

        return genre;
    }

    public int getCompletionTime() {

        return this.completionTime;

    }

    public String getTitle() {

        return this.title;

    }

    public void showInfo(){

        String gameInfo = this.getTitle() + ", " + this.getGenre() + " -completion time: " + this.completionTime + " hours";

        System.out.println(gameInfo);

    }
}
