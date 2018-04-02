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

  @Override public void doAction(int option){
    switch (option) {
      case 1: viewMap();
        break;
      case 2: viewList();
        break;
      case 3: moveNewLocation();
        break;
      case 4: manageCrops();
        break;
     case 5: 
       return;
       // break;
    }//close switch
  }//close doAction
  
  //Jem
  public void viewList() {
        ListMenuView lv = new ListMenuView();
        lv.displayMenu();
  }
  
  //Jem
  public void viewMap() {
        System.out.println("\nHere is Your Map:");
        
    }
  
  //Jem
  public void moveNewLocation() {
        System.out.println("\nDisplay moveNewLocation() here");
  }
  //Jem
  public void manageCrops() {
       CropView.runCropsView();
  }
          
}//close class GameMenuView

