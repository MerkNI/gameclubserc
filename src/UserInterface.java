public class UserInterface {

    private InputReader reader;

    private GameLibrary library;

    public UserInterface() {

        this.reader = new InputReader();

    }

    public void showMainMenu() {

        boolean quit = false;

        while (quit = false) {

            System.out.println("Please select an option: ");
            System.out.println("1. add a new game");
            System.out.println("2. show all games");
            System.out.println("3. show games count");
            System.out.println("0. quit");

            String userInput = reader.getInput();

            switch (userInput) {

                case "1":
                    this.addGame();
                    break;
                case"2":
                    //this.showAllGames();
                    break;
                case "3":
                    //this.gameCount();
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
    }
}
