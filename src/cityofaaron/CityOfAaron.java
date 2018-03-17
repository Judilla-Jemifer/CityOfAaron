
package cityofaaron;//contains main method

/**
 * @authors Jemifer/Jacalyn/Clayton
 */

//The * tells it to import all files in the model folder
import byu.cit260.cityOfAaron.model.*;
import byu.cit260.cityOfAaron.view.*;
import byu.cit260.cityOfAaron.control.*;

public class CityOfAaron {

    //variable for keeping a reference to the Game object
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game theGame) {
        currentGame = theGame;
    }

    private CropData theCrops = null; 
    
    //the getCrops() method
    //Purpose: get a reference to the crop object
    //Parameters: none
    //Returns: a reference to a crop object
    public CropData getCrop()
    {
        return theCrops;
    }
    
    //the setCrops() method 
    //Purpose: store a reference to a crop object
    //Parameters: a reference to a crop object
    //Returns: none
    public void setCrop(CropData  _cropRef)
    {
        theCrops = _cropRef;
    } 
    
    //main function - entry point for the program
    //runs the main menus
    public static void main(String[] args) {
 
   
    MainMenuView mmv = new MainMenuView();
    mmv.displayMenu();//This will show the main Menu
    
  }//close main
}//end of class
