package byu.cit260.cityOfAaron.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;

public class GameMenuView extends MenuView{

  public GameMenuView(){
    super( "\n***************************"+
               "\n***      GAME MENU      ***"+
               "\n***************************"+
               "\n1 - View the Map"+
               "\n2 - View/Print a List"+
               "\n3 - Move to a new Location"+
               "\n4 - Manage the Crops"+
               "\n5 - Return to the Main Menu",
                5);
  }//close gameMenuView

  public void doAction(int option){
    switch (option) {
      case 1: System.out.println("\n...this is the map...");
        break;
      case 2: displayListMenuView();
        break;
      case 3: System.out.println("\n...move to a new location...");
        break;
      case 4: manageCrops();
        break;
     // case 5: System.out.println("\n...going back to main menu...");
      //  MainMenuView mainMenuView = new MainMenuView();
     //   mainMenuView.displayMenuView();
       // break;
    }//close switch
  }//close doAction
  
  //Jem
  public void displayListMenuView() {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
  }
  
  //Jem
  public void manageCrops() {
       CropView.runCropsView();
  }
          
}//close class GameMenuView

