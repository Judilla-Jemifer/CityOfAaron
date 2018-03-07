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
    private static final int ACRES_PER_BUSHEL = 2; //1 bushel of wheat will plant on 2 acres of land
    private static final int PEOPLE_PER_ACRE = 9; //9 people can farm 1 acre
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
    CropControl.buyLand(price, toBuy, theCropData); 
    //I thought of changing the order of price and toBuy to match it to buyLand method in cropControl
    //I'm doing the same to the sellLand -- Jem
  
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
    CropControl.sellLand(price, toSell, theCropData);//error because the parameters we are passing here are different from the parameters needed by that method
    //i.e. sellLand(int landPrice, int acresToSell, CropData cropData)
  }

  //@Jem
  public static void feedPeopleView(){
    //Get the cost of the land for this round
   
    //Prompt user to enter the amount of acres to sell
    System.out.print("\nHow many bushles of grain do you want to give to people?");
    //Get the user's input and save it
    int toFeed;
    toFeed = keyboard.nextInt();
    //Call the feedPeople() method in the control layer to sell the land
    CropControl.feedPeople(toFeed, theCropData);
  }
  
  //@Jem
  public static void plantCropsView(){
    //Get the cost of the land for this round
   
    //Prompt user to enter the amount of acres to sell
    System.out.print("\nHow many acres of land do you want to plant?");
    //Get the user's input and save it
    int toPlant;
    toPlant = keyboard.nextInt();
    //Call the plantCrop() method in the control layer to sell the land
    CropControl.plantCrop(toPlant, theCropData);
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

        //showStarvedView();

        //displayCropsReportView();
        
    }
}
