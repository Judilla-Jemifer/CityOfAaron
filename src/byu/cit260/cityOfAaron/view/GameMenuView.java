package byu.cit260.cityOfAaron.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;

public class GameMenuView{

  Scanner keyboard = new Scanner(System.in);

  private String gameMenu;
  private int max;

  public GameMenuView(){
    gameMenu = "\n***************************"+
               "\n***      GAME MENU      ***"+
               "\n***************************"+
               "\n1 - View the Map"+
               "\n2 - View/Print a List"+
               "\n3 - Move to a new Location"+
               "\n4 - Manage the Crops"+
               "\n5 - Return to the Main Menu";
              
    max = 5;
  }//close gameMenuView

  public void displayGameMenuView(){
    int menuOption;
    do{
      System.out.println(gameMenu);

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
  }//close getMenuOption

  public void doAction(int option){
    switch (option) {
      case 1: System.out.println("\n...this is the map...");
        break;
      case 2: System.out.println("\n...here you can view or print a list...");
        break;
      case 3: System.out.println("\n...move to a new location...");
        break;
      case 4: System.out.println("\n...here you can manage the crops...");
        break;
      case 5: System.out.println("\n...going back to main menu...");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenuView();
        break;
    }//close switch
  }//close doAction

}//close class GameMenuView
