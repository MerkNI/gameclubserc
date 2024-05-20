import java.util.ArrayList;
public class GameLibrary {

    private ArrayList<Game> games;

    public GameLibrary() {

        games = new ArrayList<Game>();

    }

    public void addGames (Game g){

        this.games.add(g);
    }

    public void showGames(){

        for(Game g : this.games){

            g.displayDetails();

        }
    }

    public int gameCount(){

        int count = this.games.size();

        return count;
    }

}
