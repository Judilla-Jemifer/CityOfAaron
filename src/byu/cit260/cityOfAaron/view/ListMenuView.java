
package byu.cit260.cityOfAaron.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;

/*The ListMenuView class - part of the view layer
 * Object: Manage the list menu
 * @author Jemifer
 * Date last modified: February 2018
 */

public class ListMenuView extends MenuView{
    

public ListMenuView(){
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view
    
    super( "\n***************************"+
               "\n***      LIST MENU      ***"+
               "\n***************************"+
               "\n1 - List or view the animals in the storehouse"+
               "\n2 - List or view the tools in the storehouse"+
               "\n3 - List or view the provisions in the storehouse"+
               "\n4 - List or view the authors of this game" +
               "\n5 - Return to Game Menu",
                5);
  }

@Override public void doAction(int option){
    switch (option) {
      case 1: displayAnimalsList();
        break;
      case 2: displayToolsList();
        break;
      case 3: displayProvisionsList();
        break;
      case 4: displayAuthorsList();
        break;
      case 5:
          return;
          
        
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



