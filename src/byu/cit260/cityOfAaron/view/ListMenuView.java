package byu.cit260.cityOfAaron.view;

import byu.cit260.cityOfAaron.model.*;
import cityofaaron.CityOfAaron;//aka our GameProject class
import java.io.Serializable;
import java.util.ArrayList;

/*The ListMenuView class - part of the view layer
 * Object: Manage the list menu
 * @author Jemifer
 * Date last modified: February 2018
 */
public class ListMenuView extends MenuView implements Serializable{
    private static Game theGame = CityOfAaron.getCurrentGame();
    private static CropData theCropData = theGame.getCropData();
    private String gameMenu;
    private String listMenu;
    private String mainMenu;
    
    public ListMenuView() {
    //Display the menu
    //Prompt user and get user's input
    //Perform the desired action
    //determine and display the next view

        super( "\n" +
            "**********************************\n" +
            "* CITY OF AARON: LIST MENU  *\n" +
            "**********************************\n" +
            " 1 - List or View the animals in the storehouse\n" +
            " 2 - List or View the tools in the storehouse\n" +
            " 3 - List or View the provisions in the storehouse\n" +
            " 4 - List or View the development team\n" +
            " 5 - Return to the Main Menu\n",
        5);
    }

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @ Override public void doAction(int option) {
        switch(option) {
            case 1: // view or print list of Animals
                listAnimals();
                break;
            case 2: // view or print a list of Tools
                displayToolsList();
                break;
            case 3: // view or print a list of Provisions
                displayProvisionsList();
                break;
            case 4: // view or print a list of Authors
                displayAuthorsList();
                break;
            case 5: // back to main menu
                break;
        }//close switch
    }//close doAction
    
    // Display list of  Animals method
    // Purpose: displays a list of animals in the storehouse
    // Parameters: none
    // Returns: none
    //--Jacalyn
    // ===================================   
    public void listAnimals( ) {
        System.out.println("\n" +
            "**************************************\n" +
            "Your animals in the City of Aaron:\n" +
            "**************************************\n");
        
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        for (int i = 0; i < animals.size(); i++) {
            ListItem listItem = animals.get(i);
            System.out.println("\n\tItem: " + listItem.getName() +
                               "\n\tQuantity: " + listItem.getNumber());
        }
    }
   
  //displayToolsList by Clayton
  public void displayToolsList() {
    System.out.println("\n" +
        "**************************************\n" +
        "Your tools in the City of Aaron:\n" +
        "**************************************\n");

        ArrayList<ListItem> tools = theGame.getTools();

        for (int i = 0; i < tools.size(); i++) {
            ListItem listItem = tools.get(i);
            System.out.println("\n\tItem: " + listItem.getName() +
                               "\n\tQuantity: " + listItem.getNumber());
        }

  }//close displayToolsList

  
  //Jem
 public void displayProvisionsList(){
    System.out.println("\n" +
        "**************************************\n" +
        "Your provisions in the City of Aaron:\n" +
        "**************************************\n");
     
       ArrayList<ListItem> provisions = theGame.getProvisions();
      
        
       for (int i = 0; i < provisions.size(); i++) {
            //ListItem listItem = provisions.get(i);
            //System.out.println("\n\tItem: " + listItem.getName() +
                               //"\n\tQuantity: " + listItem.getNumber());
         
            System.out.println(provisions.get(i).getName() + provisions.get(i).getNumber());
        }
  }//close displayProvisionsList

 
 public void displayAuthorsList(){
    System.out.println("\n Display authors list here.");
  }
}//close class GameMenuView
