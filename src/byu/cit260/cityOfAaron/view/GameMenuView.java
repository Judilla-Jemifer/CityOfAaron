package byu.cit260.cityOfAaron.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;//aka our GameProject class
import byu.cit260.cityOfAaron.model.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameMenuView extends MenuView{
 //Refrence to a Game object
  private static Game theGame;
  
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
      case 4: {
        try {
            manageCrops();
        } catch (Exception ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
        System.out.println("\n         ***VILLAGE MAP***         "
                          +"\n     1      2     3     4      5   "
                          +"\n 1 | ... | ... | !!! | ~~~ | !!!  |"
                          +"\n 2 | l^l | +++ | !!! | ~~~ | !!!  |"
                          +"\n 3 | oOo | oOo | !!! | ~~~ | !!!  |" 
                          +"\n 4 | oOo | oOo | !!! | ~~~ | !!!  |"
                          +"\n 5 | oOo | oOo | !!! | ~~~ | !!!  |"
                          +"\n "
                          +"\nKey:"
                          +"\noOo - village"
                          +"\n!!! - farmland"
                          +"\n!!! - river"
                          +"\n!!! - desert"
                          +"\n+++ - temple"
                          +"\nl^l - market");
       
        
        
    }
  
  //Jem
  public void moveNewLocation() {
        System.out.println("\nDisplay moveNewLocation() here");
  }
  //Jem
  public void manageCrops() throws Exception {
       CropView.runCropsView();
  }
          
}//close class GameMenuView

