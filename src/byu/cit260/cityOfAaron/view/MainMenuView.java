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
public MainMenuView(){
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
  public void startNewGame(){

//Create a new Game object.
    //Game theGame = new Game();//i think this should be commented out per week10 slides28-33

    //Save a reference to it in the City of Aaron class
   // CityOfAaron.setCurrentGame(theGame);

    //Display the Banner Page

    System.out.println(
       "\n***************************************************************************************\n" +
       "* Welcome to the City of Aaron. You have been summoned here by the High Priest           *\n" +
       "* to assume your role as ruler of the city. Your responsibility is to buy and sell land, *\n" +
       "* determine how much wheat to plant each year and how much to set aside to feed          *\n" +
       "* your people. In addition, it will be your job to pay an annual tithe on the wheat that *\n" +
       "* is harvested. If you fail to provide enough wheat for the people, people will starve,  *\n" +
       "* some people will die, and your workforce will be diminished. Plan carefully. And       *\n" +
       "* Oh, there is always a danger of rats eating your wheat.                                *\n" +
       "* Welcome to the City of Aaron.                                                          *\n" +
       "******************************************************************************************\n");

    //Create a new Player object
    Player thePlayer = new Player();

    //Prompt for and get the user's name
    String name;
    System.out.println("\nPlease type in your first name: ");
    name = keyboard.next();

    //Save the user's name in the Player object
    thePlayer.setPlayerName(name);

    //Save a reference to the player object in the Game object
    theGame.setPlayer(thePlayer);

    //Display a welcome message
    System.out.println("\nWelcome, " + name + ". Have fun!");

    //Create the CropData object,
    //initialize it and save a reference to it in the Game
/*    CropData theCrops = new CropData();
    theCrops.setYear(0);
    theCrops.setPopulation(100);
    theCrops.setNewPeople(5);
    theCrops.setCropYield(3);
    theCrops.setNumberWhoDied(0);
    theCrops.setOffering(10);
    theCrops.setWheatInStore(2700);
    theCrops.setAcresOwned(1000);
    theCrops.setAcresPlanted(1000);
    theCrops.setHarvest(3000);
    theCrops.setOfferingBushels(300);
    theCrops.setAcresPlanted(1000);

    theGame.setCropData(theCrops);
*/ //i think this section should be commented per week10 slide38-40

    GameControl.createNewGame(name);//added per week10 slide30

    //Display the Game menu
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
  }//close startNewGame


  public void startSavedGame(){
    System.out.println("\n Start Saved Game option selected.");
  }//close startSavedGame

  public void displayHelpMenuView(){
    HelpMenuView hmv = new HelpMenuView();
          hmv.displayMenu();
            //new HelpMenuView();
  }//close displayHelpMenu

  public void displaySaveGameView(){
    System.out.println("\n Display Save Game option selected.");
  }//close displaySaveGame

}
