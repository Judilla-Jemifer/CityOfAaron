package byu.cit260.cityOfAaron.view;
/**
 *
 * @author Jacalyn
 */

import byu.cit260.cityOfAaron.model.*;
import byu.cit260.cityOfAaron.control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class CropView {
    //Create a scanner object
    private static Scanner keyboard = new Scanner(System.in);

//Get refernce to the Game object and the Crops object
  private static Game theGame = CityOfAaron.getCurrentGame();
  private static CropData theCropData = theGame.getCropData();

//The buyLandView() method
//Purpose: interface with the user input for buying land
//Parameters: none
//Returns: none
  public static void buyLandView(){
    //Get the cost of land for this round
    int price = CropControl.CalcLandCost();

    //Prompt the user to enter the number of acres to buy
    System.out.format("Land is selling for %d bushels per acres.%n",price);
    System.out.print("\nHow many acres of land do you wish to buy?");

    //Get the user's input and save it.
    int toBuy;
    toBuy = keyboard.nextInt();

    //Call the buyLand() method in the control layer to buy the land
    CropControl.buyLand(toBuy, price);
  }

  public static void sellLandView(){
    //Get the cost of the land for this round
    int price = CropControl.CalcLandCost();
    //Prompt user to enter the amount of acres to sell
    System.out.print("\nHow many acres do you wish to sell?");
    //Get the user's input and save it
    int toSell;
    toSell = keyboard.nextInt();
    //Call the sellLand() method in the control layer to sell the land
    CropControl.sellLand(toSell, price);
  }


    //The runCropsView method()
    //Purpose: runs the Game
    //Parameters: none
    //Returns: none
    public static void runCropsView()
    {
        //call the buyLandView() method
        buyLandView();

        //add calls to the other crop view methods
        //as they are written

        //call the sellLandView() method
        sellLandView();

        //by Clayton
        feedPeopleView();

        plantCropsView();

        showStarvedView();

        displayCropsReportView();
        
    }
}
