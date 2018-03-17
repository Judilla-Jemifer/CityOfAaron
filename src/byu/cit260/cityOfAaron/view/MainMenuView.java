package byu.cit260.cityOfAaron.view;
/**
 * The MainMenuView class - part of the view layer
 * Object: Manage the main menu
 * @authors Clayton, Jemifer, Jacalyn
 * Date last modified: February 2018
 */
import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;
import byu.cit260.cityOfAaron.control.*;

public class MainMenuView extends MenuView {

    //The displayMenuView method
    //Purpose: Displays the main menu, gets user input, performs selected action
    //Parameters: none
    //Returns: none

//build constructor
public MainMenuView() {
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view
  super( "\n" +
  "**********************************\n" +
  "* CITY OF AARON: MAIN GAME MENU *\n" +
  "**********************************\n" +
  " 1 - Start new game\n" +
  " 2 - Get and start a saved game\n" +
  " 3 - Get help on playing the game\n" +
  " 4 - Save game\n" +
  " 5 - Quit\n",
  5);
}


  //The doAction method
      //Purpose: performs the selection action
      //Parameters: none
      //Returns: none

  @Override public void doAction(int option){
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
<<<<<<< HEAD
  public void startNewGame(){

//Create a new Game object.
    Game theGame = new Game();
//i think this should be commented out per week10 slides28-33
//yes but the game would not run without this
//If this does not belong here, where should we put it then? It's not stated - Jem
    //Save a reference to it in the City of Aaron class
    CityOfAaron.setCurrentGame(theGame);

    //Display the Banner Page
=======
  public void startNewGame() {
      
      //Display the Banner Page
>>>>>>> 9566e95c6a28104310e4b0d29b37bb081269548e

    System.out.println(
       "\n*********************************************************************************************\n" +
       "Welcome to the City of Aaron. You have been summoned here by the High Priest \n" +
       "to assume your role as ruler of the city. Your responsibility is to buy and sell land, \n" +
       "determine how much wheat to plant each year and how much to set aside to feed \n" +
       "your people. You will also be required to pay an annual tithe on the wheat that \n" +
       "is harvested. If you fail to provide enough wheat for the people, people will die  \n" +
       "and your workforce will be diminished. Plan very carefully. or you may find yourself \n" + 
        "in trouble with the people.  And oh, watch out for plagues and rats! \n" +
       "Welcome to the City of Aaron.\n" +
    "*********************************************************************************************\n");
     //Get the Player  name
    String name;
    System.out.println("\nPlease type in your first name: ");
    name = keyboard.next();
    //Welcome message
    System.out.println("\nWelcome, " + name + ". Have fun!");
    
        //call the createNewGame() method. Pass the name as a parameter
    GameControl.createNewGame(name); 
    
    //show the game menu
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
  }

  public void startSavedGame() {
    System.out.println("\n Start Saved Game option selected.");
  }//close startSavedGame

  public void displayHelpMenuView(){
    HelpMenuView hmv = new HelpMenuView();
          hmv.displayMenu();
  }//close displayHelpMenu

  public void displaySaveGameView(){
    System.out.println("\n Display Save Game option selected.");
  }//close displaySaveGame

}