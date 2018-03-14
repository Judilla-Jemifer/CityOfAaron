
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


public class HelpMenuView extends MenuView {
    
    //The Method
    //Purpose: Displays the help menu, gets user input, performs selected action
    //Parameters: none
    //Returns: none

//build constructor
public HelpMenuView(){
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view

  super("\n" +
  "**********************************\n" +
  "* CITY OF AARON: GAME HELP MENU *\n" +
  "**********************************\n" +
  " 1 - What are the goals of the game?\n" +
  " 2 - Where is the city of Aaron?\n" +
  " 3 - How do I view the map?\n" +
  " 4 - How do I move to another location?\n" +
  " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +        
  " 6 - Return to the Main Menu\n",
  6);
}

  //The doAction method
      //Purpose: performs the selection action
      //Parameters: none
      //Returns: none
     //I couldn't find actual answers to what these questios should be so I have place holder text that is hopefully amuse the end-user until we can fix this . --Jacalyn

  @Override public void doAction(int option){
    switch (option) {
        //if the option is 1, What are the goals of the game?()
      case 1: System.out.println
        ("\n The goal is to survive 10 years as ruler.\n" +
         "You have to decide how much land to buy, how much land\n"+
        "to sell, how much wheat to feed your people, and how\n" +
         "much wheat to plant for the year.\n\n" +
          "if too many people starve, you will be impeached.\n");
        break;
        //if the option is 2, Where is the City of Aaron?()
      case 2: System.out.println
        ("\n You are the City of Aaaron near Nephihah.\n" +
         "According to The Book of Mormon, the city of Aaron was\n" +
          "located near Nephihah, though constructed earlier. Prior\n" +
           "to the construction of Nephihah, its nearest known\n" +
           "neighbour was Moroni.\n\n" + 
           "To learn more, read Alma 8 and Alma 50 in The Book of Mormon.\n ");
        break;
        //if the option is 3, How do I view the map?()
      case 3: System.out.println("\n The game menu provides an option for displaying the map.");
        break;
        //if the option is 4, How do I move to a new location?()
      case 4: System.out.println("\n The game menu provides an option for moving to another location.");
        break;
        //if option is 5, How do I display a list?
      case 5: System.out.println
        ("\nThe game menu provides an option for displaying the list\n " + 
           "of animals in the city, the list of tools in the storehouse, the \n" +
           "other provisions in the storehouse, and the name of the\n" +
           "developers of the game.\n");
        break;
        //if option is 6, return to Main Menu
      case 6: displayMainMenuView();
      // new MainMenuView();
                break;
    }
  }//close doAction
  public void displayMainMenuView(){
    MainMenuView mmv = new MainMenuView();
    mmv.displayMenu();//This will show the main Menu
  }
}
