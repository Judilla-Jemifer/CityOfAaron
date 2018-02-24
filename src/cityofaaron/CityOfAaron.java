
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
        CityOfAaron.currentGame = currentGame;
    }
  
    //main function - entry point for the program
    //runs the main menus
    public static void main(String[] args) {

    MainMenuView mmv = new MainMenuView();
    mmv.displayMenuView();
    

    
    
    
    Player playerOne = new Player();
    playerOne.setPlayerName("Alma The Missionary");

    String playerOneName = playerOne.getName();
    System.out.println(playerOne.toString());

    //set Location instance - Jacalyn
    Location location = new Location();
    location.setDescription("The City of Aaron, near Nephihah");

    String locationDescription = location.getDescription();
    System.out.println(location.toString());



    //From Jem
    ListItem animalsOne = new ListItem();

    animalsOne.setName("sheep");
    animalsOne.setNumber(12);


    String animalsOneName = animalsOne.getName();
    double animalsOneNumber = animalsOne.getNumber();

    System.out.println(animalsOne.toString());

    //for tools
    ListItem toolsOne = new ListItem();

    toolsOne.setName("sword");
    toolsOne.setNumber(7);

    String toolsOneName = toolsOne.getName();
    double toolsOneNumber = toolsOne.getNumber();

    System.out.println(toolsOne.toString());

    //for provisions
    ListItem provisionsOne = new ListItem();

    provisionsOne.setName("helmet");
    provisionsOne.setNumber(7);

    String provisionsOneName = provisionsOne.getName();
    double provisionsOneNumber = provisionsOne.getNumber();

    System.out.println(provisionsOne.toString());



  }//close main
}//end of class
