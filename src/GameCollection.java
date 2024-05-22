import java.util.ArrayList;
public class GameCollection {

    private ArrayList<Game> games;

    public GameCollection() {

        games = new ArrayList<Game>();

    }

    public void addGames( Game g){

        this.games.add(g);
    }

    public void showGames(){

        if (this.games.isEmpty())
        {
            System.out.println("No games have been added");
        }
        else {
            for (Game g : this.games) {

                g.displayDetails();

            }

        }


        }


    public int gameCount() {

        int count = this.games.size();

        return count;


    }
}
