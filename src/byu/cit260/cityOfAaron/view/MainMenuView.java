package byu.cit260.cityOfAaron.view;
/**
 * The MainMenuView class - part of the view layer
 * Object: Manage the main menu
 * @authors Clayton, Jemifer, Jacalyn
 */
import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;

public class MainMenuView {
    Scanner keyboard = new Scanner(System.in);

    //The displayMenuView method
    //Purpose: Displays the main menu, gets user input, performs selected action
    //Parameters: none
    //Returns: none

private String mainMenu;
private int max;
//build constructor
public MainMenuView(){
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view

  mainMenu = "\n" +
  "**********************************\n" +
  "* CITY OF AARON: MAIN GAME MENU *\n" +
  "**********************************\n" +
  " 1 - Start new game\n" +
  " 2 - Get and start a saved game\n" +
  " 3 - Get help on playing the game\n" +
  " 4 - Save game\n" +
  " 5 - Quit\n";
  max = 5;
}


  public displayMainMenu(){
    int menuOption;
    do{
      //display the menu
      System.out.println(mainMenu);
      //prompt the user for input
      menuOption = getMenuOption();
      //perform action
      doAction(menuOption);
      //determine and display next view

    }while (menuOption != max);

  }//close displayMainMenu

  //The getMenuOption method
  //Purpose: gets the user's input
  //Parameters: None
  //Returns: Integer - the option selected

  public int getMenuOption(){
    //declare variable to hold user input
    int userInput;
    //begin loop
    do{
      //get user input from keyboard
      userInput = keyboard.nextInt();
      //if invalid input, output error message
      if(userInput < 1 || userInput > max){
        System.out.println("\n Option must be between 1 and " + max);
        }
        //loop back to top if input invalid
      }while(userInput < 1 || userInput > max);
      //return the value input by the user
    return userInput;
  }//close getMenuOption

  //The doAction method
      //Purpose: performs the selection action
      //Parameters: none
      //Returns: none

  public void doAction(int option){
    switch (option) {
        //if the option is 1, call startNewGame()
      case 1: startNewGame();
        break;
        //if the option is 2, call startExistingGame()
      case 2: startSavedGame();
        break;
        //if the option is 3, call displayHelpMenu()
      case 3: displayHelpMenuView();
        break;
        //if the option is 4, call displaySaveGame()
      case 4: displaySaveGameView();
        break;
        //if option is 5, display goodbye message
      case 5:
          System.out.println("Thanks for playing, goodbye");
    }
  }//close doAction

  //The startNewGame method
  //Purpose: Creates game object and starts the game
  //Parameters: none
  //Returns: none
  public void startNewGame(){
    //Create a new Game object.
    Game theGame = new Game;

    //Save a reference to it in the City of Aaron class
    CityOfAaron.setCurrentGame(theGame);

    //Display the Banner Page
    //We need to "include much more and so need to look at the requirements document" - Jacalyn
    System.out.println("\nWelcome to the City of Aaron.");

    //Create a new Player object
    Player thePlayer = new Player();

    //Prompt for and get the user's name
    String name;
    System.out.println("\nPlease type in your first name: ");
    name=keyboard.next();

    //Save the user's name in the Player object
    thePlayer.setPlayerName(name);

    //Save a reference to the player object in the Game object
    theGame.setPlayer(thePlayer);

    //Display a welcome message
    System.out.println("\nWelcome, " + name + ". Have fun!");

    //Display the Game menu
    //"You won't fill in the code to do this until you have created the GameMenuView class." -From slide 67 of 69 Week 7 - Jacalyn
  }//close startNewGame

  public void startSavedGame(){
    System.out.println("\n Start Saved Game option selected.");
  }//close startSavedGame

  public void displayHelpMenuView(){
    System.out.println("\n Display help menu option selected.");
  }//close displayHelpMenu

  public void displaySaveGameView(){
    System.out.println("\n Display Save Game option selected.");
  }//close displaySaveGame

}