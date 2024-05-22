public class GameManagementSystem {

    private InputReader reader;

    private GameCollection library;

    public GameManagementSystem() {

        this.reader = new InputReader();
        this.library = new GameCollection();

    }

    public void showMainMenu() {

        boolean quit = false;

        while (quit == false) {

            System.out.println("Please select an option: ");
            System.out.println("1. add a new game");
            System.out.println("2. show all games");
            System.out.println("3. show games count");
            System.out.println("0. exit");

            String userInput = reader.getInput();

            switch (userInput) {

                case "1":
                    this.addGame();
                    break;
                case"2":
                    library.showGames();
                    break;
                case "3":
                    this.gameCount();
                    break;
                case"0":
                    quit = true;
                    break;
                default:
                    System.out.println("That was not a valid choice.");

            }

        }

    }

    public void addGame() {

        System.out.println("Please enter the title of the game: ");
        String title = reader.getInput();



        System.out.println("Please enter the release year of the game: ");
        String userInput = reader.getInput();
        int releaseYear = 0;



        try {

            releaseYear = Integer.parseInt(userInput);

        }
        catch (NumberFormatException exception) {

            System.err.println("The input could not be parsed to an int.");
            return;

        }

        Genre aGenre;

        System.out.println("1. FPS");
        System.out.println("2. HORROR");
        System.out.println("3. SCIFI");
        System.out.println("4. EXPLORATION");
        System.out.println("5. RACING");
        System.out.println("6. MMO");
        System.out.println("7. RPG");
        System.out.println("8. BUILDING");
        System.out.println("9. SURVIVAL");

        userInput = reader.getInput();

        int genreNumber = 1;

        try {

            genreNumber = Integer.parseInt(userInput);
        }
        catch (NumberFormatException exception) {

            System.err.println("Your input could not be parsed into an int.");
            return;

        }

        if ( genreNumber < 1 || genreNumber > 6) {

            System.err.println("Input invalid");
            return;

        }

        Genre genre = Genre.FPS;

        switch (genreNumber) {

            case 1:
                genre = Genre.FPS;
                break;
            case 2:
                genre = Genre.HORROR;
                break;
            case 3:
                genre = Genre.SCIFI;
                break;
            case 4:
                genre = Genre.EXPLORATION;
                break;
            case 5:
                genre = Genre.RACING;
                break;
            case 6:
                genre = Genre.MMO;
                break;
            case 7:
                genre = Genre.RPG;
                break;
            case 8:
                genre = Genre.BUILDING;
                break;
            case 9:
                genre = Genre.SURVIVAL;
                break;

        }

        Game g = new Game(title, releaseYear, genre);
        this.library.addGames(g);



    }

    public void showGames() {

        this.library.showGames();

    }

    public void gameCount() {

        int count = this.library.gameCount();
        System.out.println(count);

    }





}
