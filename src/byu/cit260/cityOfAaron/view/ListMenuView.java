
package byu.cit260.cityOfAaron.view;

import java.util.Scanner;

/*The ListMenuView class - part of the view layer
 * Object: Manage the list menu
 * @author Jemifer
 * Date last modified: February 2018
 */

public class ListMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    
    //The ListMenuView Method
    //Purpose: Displays the list menu, gets user input, performs selected action
    //Parameters: none
    //Returns: none
    
private String listMenu;
private int max;

public ListMenuView(){
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view
    
    listMenu = "\n***************************"+
               "\n***      LIST MENU      ***"+
               "\n***************************"+
               "\n1 - List or view the animals in the storehouse"+
               "\n2 - List or view the tools in the storehouse"+
               "\n3 - List or view the provisions in the storehouse"+
               "\n4 - List or view the authors of this game";
                            
    max = 4;
  }

public void displayListMenuView(){
    int menuOption;
    do{
      System.out.println(listMenu);

      menuOption = getMenuOption();

      doAction(menuOption);
    }while (menuOption != max);
  }//close displayGameMenuView

  public int getMenuOption(){
    int userInput;
    do{
      userInput = keyboard.nextInt();

      if(userInput < 1 || userInput > max){
        System.out.println("\nOption must be between 1 and " + max);
      }
    }while (userInput < 1 || userInput > max);
    
    return userInput;
  }//close getMenuOption

  public void doAction(int option){
    switch (option) {
      case 1: displayAnimalsList();
        break;
      case 2: displayToolsList();
        break;
      case 3: displayProvisionsList();
        break;
      case 4: displayAuthorsList();
        break;
        
    }//close switch
  }//close doAction
 public void displayAnimalsList(){
    System.out.println("\n Display animals list here.");
  }
 
 public void displayToolsList(){
    System.out.println("\n Display tools list here.");
  }
 
 public void displayProvisionsList(){
    System.out.println("\n Display provisions list here.");
  }
 
 public void displayAuthorsList(){
    System.out.println("\n Display authors list here.");
  }
}//close class GameMenuView



