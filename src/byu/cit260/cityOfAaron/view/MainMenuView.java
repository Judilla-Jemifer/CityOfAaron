package byu.cit260.cityOfAaron.view;
/**
 * @authors Clayton, Jemifer, Jacalyn
 */
import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.Player;

public class MainMenuView {

Scanner keyboard = new Scanner(System.in);

private String mainMenu;
private int max;
//build constructor
public mainMenuView(){
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

  public int getMenuOption(){
    //declare variable to hold user input
    int userInput;
    //begin loop
    do{
      //get user input from keyboard
      userInput = keyboard.nextInt();
      //if invalid input, output error message
      if(userInput < 1 || userInput > max){
        System.out.println("\n option must be between 1 and" + max);
        }
        //loop back to top if input invalid
      }while(userInput < 1 || userInput > max);
      //return the value input by the user
    return userInput;
  }//close getMenuOption

  public void doAction(int option){
    switch (option) {
      case 1: startNewGame();
        break;
      case 2: startSavedGame();
        break;
      case 3: displayHelpMenu();
        break;
      case 4: displaySaveGame();
        break;
      case 5: System.out.println("Thanks for playing, goodbye");
    }
  }//close doAction

  public void startNewGame(){
    System.out.println("\n Start New Game option selected.");
  }//close startNewGame

  public void startSavedGame(){
    System.out.println("\n Start Saved Game option selected.");
  }//close startSavedGame

  public void displayHelpMenu(){
    System.out.println("\n Display help menu option selected.");
  }//close displayHelpMenu

  public void displaySaveGame(){
    System.out.println("\n Display Save Game option selected.");
  }//close displaySaveGame

}
