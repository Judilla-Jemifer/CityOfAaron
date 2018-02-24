
package byu.cit260.cityOfAaron.view;

/**
 * The HelpMenuView class - part of the view layer
 * Object: Manage the help menu
 * @authors Clayton, Jemifer, Jacalyn
 * Date last modified: February 2018
 */

import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;


public class HelpMenuView {
    
    Scanner keyboard = new Scanner(System.in);

    //The Method
    //Purpose: Displays the help menu, gets user input, performs selected action
    //Parameters: none
    //Returns: none

private String helpMenu;
private int max;
//build constructor
public HelpMenuView(){
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view

  helpMenu = "\n" +
  "**********************************\n" +
  "* CITY OF AARON: GAME HELP MENU *\n" +
  "**********************************\n" +
  " 1 - What are the goals?\n" +
  " 2 - Where are we?\n" +
  " 3 - How does the map work?\n" +
  " 4 - How does the list work?\n" +
  " 5 - How do I move?\n" +        
  " 6 - Quit\n";
  max = 6;
}
public void displayHelpMenuView(){
    int menuOption;
    do{
      //display the menu
      System.out.println(helpMenu);
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
      case 1: System.out.println("\n The goal is to survive.");
        break;
        //if the option is 2, call startExistingGame()
      case 2: System.out.println("\n You are the City of Aaaron near Nephihah.");
        break;
        //if the option is 3, call displayHelpMenu()
      case 3: System.out.println("\n I don't navigate.");
        break;
        //if the option is 4, call displaySaveGame()
      case 4: System.out.println("\n The list - the only way to shop.");
        break;
        //if option is 5, 
      case 5: System.out.println("\n Shake Your Groove Thing.");
        break;
        //if option is 6, return to Main Menu
      case 6: System.out.println("\n This was no help. Taking you back to the manin menu now.");
          MainMenuView mainMenuView = new MainMenuView();
          mainMenuView.displayMenuView();
                break;
    }
  }//close doAction
}
