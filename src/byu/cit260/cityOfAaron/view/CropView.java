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
    private static final int BUSHELS_PER_PERSON = 20; // 20 bushels set aside for food can feed 1person
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
    int landPrice = CropControl.CalcLandCost();

    //Prompt the user to enter the number of acres to buy
    System.out.format("Land is selling for %d bushels per acres.%n",landPrice);
    System.out.print("\nHow many acres of land do you wish to buy?");

    //Get the user's input and save it.
    int acresToBuy = keyboard.nextInt();

    //Call the buyLand() method in the control layer to buy the land
    CropControl.buyLand(landPrice, acresToBuy, theCropData); 
    //I thought of changing the order of price and toBuy to match it to buyLand method in cropControl
    //I'm doing the same to the sellLand -- Jem
  
  }

  public static void sellLandView(){
    //Get the cost of the land for this round
    int landPrice = CropControl.CalcLandCost();
    //Prompt user to enter the amount of acres to sell
    System.out.print("\nHow many acres do you wish to sell?");
    //Get the user's input and save it
    int acresToSell;
    acresToSell = keyboard.nextInt();
    //Call the sellLand() method in the control layer to sell the land
    CropControl.sellLand(landPrice, acresToSell, theCropData);//error because the parameters we are passing here are different from the parameters needed by that method
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
  
  
  //The plantsCropView method()
    //Purpose: allows user to input acres of land to plant with seed
    //Parameters: none
    //Returns: none
  //@Jem
  public static void plantCropsView(){
    //Prompt user to enter the number of acres to plant with seed
    System.out.print("\nHow many acres of land do you want to plant with seed?");
    //Get the user's input and save it
    int toPlant;
    toPlant = keyboard.nextInt();
    //Call the plantCrop() method in the control layer to plant crop
    CropControl.plantCrop(toPlant, theCropData);
  }

    //The runCropsView method()
    //Purpose: runs the Game
    //Parameters: none
    //Returns: none
 
    //Tithes and Offerings by Jacalyn
    public static void payOfferingView() {
        //Prompt for user to input amount of Offerings to pay
        System.out.format("\nThe amount of tithing you offer will directly affect your harvest outcome and how much of your storage is eaten by rats/%n");
        System.out.print("\nWhat percentage of your harvest would you like to contribute to your tithe offering?");
         int offering = keyboard.nextInt();
       //Get user's input and save it
       int offeringBushels;
       int owned = theCropData.getAcresOwned();
       offeringBushels = offering*owned;
       //This part does not show the game menu back right away. 
       //I figured out it's asking for 2 inputs so I changes it to that
       //I think there should be computation rather than another input?
       //What do you think? -Jem
       
 
       //Call the payOffering method in the control layer to pay tithes and offering
       CropControl.payOffering(offeringBushels, offering, theCropData);
      
    }
    
    //The showStarvedView method()
    //Purpose: shows the number of people in the population that starved
    //Parameters: none
    //Returns: none
    //@Jem
  public static void showStarvedView(){
    //Calculate how many people were adequately fed during the year
   int wheatForPeople = theCropData.getWheatForPeople();
   int peopleFed = wheatForPeople / BUSHELS_PER_PERSON;
   //Since it takes 20 busheles of wheat (Bushels_per_person) to feed one person 
   //I divided wheatForPeople by bushels per person or 20
   int population = theCropData.getPopulation();
   
   //if (population > peopleFed ){
   //int starvedPeople = population - peopleFed;
   //System.out.print("\nThere are " + starvedPeople + " people who starved due to lack of food");
   // Just put this one for testing earlier -- Jem
   
    //Call the showStarvedView() method in the control layer to show number of people that starved
    CropControl.showStarved(peopleFed, population, theCropData);
  }
   
  
  
  //The displayCropsReportView method()
    //Purpose: to display the crops report
    //Parameters: none
    //Returns: none
    //@Jem
  public static void displayCropsReportView(){
    //get values
   int yearNumber = theCropData.getYear();
   int peopleStarved = theCropData.getNumStarved();
   int newComers = theCropData.getNewPeople();
   int population = theCropData.getPopulation();
   int currentPopulation = population + newComers;
   //will still check if there is a need to add this or it's automatically updated
   int acresOwned = theCropData.getAcresOwned();
   //bushels per acre here
   int offering = theCropData.getOffering();
   //bushles of wheat eaten by rats here
   int wheat = theCropData.getWheatInStore();
   
   //display values
   
   System.out.print("\nThe year number is " + yearNumber);
   System.out.print("\nThe number of people who starved is " + peopleStarved);
   System.out.print("\nThe number of people who came to the city is " + newComers);
   System.out.print("\nThe current population is " + currentPopulation);
   System.out.print("\nThe number of acres of cropland owned by the city is " + acresOwned);
   System.out.print("\nThe number of bushels paid in offerings is " + offering);
   System.out.print("\nThe number of wheat in store is " + wheat);
  
  }
  
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
        
        //Jem
        plantCropsView();
        
        //by Jacalyn
        payOfferingView();

           //Jem
        showStarvedView();
        
        //Jem
        displayCropsReportView();
        
    }
}