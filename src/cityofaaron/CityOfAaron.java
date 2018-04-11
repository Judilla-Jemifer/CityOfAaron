
package cityofaaron;//contains main method

import byu.cit260.cityOfAaron.model.*;
import byu.cit260.cityOfAaron.view.*;
import byu.cit260.cityOfAaron.control.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CityOfAaron {
    //variable for keeping a reference to the Game object
    private static Game currentGame = null;

    public static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }
    public static void setCurrentGame(Game theGame) {
        currentGame = theGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }
    public static void setOutFile (PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }
    public static PrintWriter getLogFile() {
        return logFile;
    }
    public static void setLogFile (PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }
    public static BufferedReader getInFile() {
        return inFile;
    }
    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }

    private CropData theCrops = null;
    //Purpose: get a reference to the crop object
    //Returns: a reference to a crop object
    public CropData getCrop()
    {
        return theCrops;
    }
    //Purpose: store a reference to a crop object
    //Parameters: a reference to a crop object
    public void setCrop(CropData  _cropRef)
    {
        theCrops = _cropRef;
    }

    //main function - entry point for the program
    //runs the main menus
    public static void main(String[] args) {
      try {
        //open character stream files for end user
        CityOfAaron.inFile = new BufferedReader(
          new InputStreamReader(System.in));
        CityOfAaron.outFile = new PrintWriter(
          System.out, true);
        logFile = new PrintWriter("logFile.text");
        //create StartProgramView and start the program
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();//This will show the main Menu
      }
      catch (Throwable e) {
        System.out.println("Exception:" + e.toString() +
                            "\nCause:" + e.getCause() +
                            "\nMessage:" + e.getMessage());
        e.printStackTrace();;
      }
      finally {
        try {
          if (CityOfAaron.inFile !=null)
              CityOfAaron.inFile.close();
            if (CityOfAaron.outFile != null)
                CityOfAaron.outFile.close();
            if (logFile!= null) {
                logFile.close();
            }
          }
          catch (IOException ex) {
              System.out.println("Error closing files");
              return;
          }
      }
    }//close main

}//end of class
