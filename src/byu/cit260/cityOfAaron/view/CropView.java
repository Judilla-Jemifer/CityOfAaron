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
    int acresToBuy;
    boolean paramsNotOk;
    do {
        paramsNotOk = false;
        System.out.print("\nHow many acres of land do you wish to buy?\n");
        acresToBuy = keyboard.nextInt();
        //Call the buyLand() method in the control layer to buy the land
        try{CropControl.buyLand(landPrice, acresToBuy, theCropData);
        }
        catch (Exception e) {
        System.out.println("I am sorry master, I cannot do this.\n");
        System.out.println(e.getMessage());
        paramsNotOk = true;
      }
    }while(paramsNotOk);
  }

  public static void payOfferingView() {
        //Prompt for user to input amount of Offerings to pay
        System.out.format("\n*Hint* The amount of tithing you offer will directly affect your harvest " +
                "\noutcome and how much of your storage is eaten by rats.\n");
       int offering;
       boolean paramsNotOk;
       do {
           paramsNotOk = false;
           System.out.print("\nWhat percentage of your harvest would you like to contribute to your tithe offering?\n");
            offering = keyboard.nextInt();
            try {CropControl.setOffering(offering, theCropData);}
           catch (Exception e) {
               System.out.println("I am sorry master, I cannot do this.\n");
               System.out.println(e.getMessage());
               paramsNotOk = true;
            }
        } while(paramsNotOk); 
        theCropData.setOffering(offering);   
    }
  public static void sellLandView(){
    //Get the cost of the land for this round
    int landPrice = CropControl.CalcLandCost();
     boolean paramsNotOk;
     do {
           paramsNotOk = false;
    //Prompt user to enter the amount of acres to sell
    System.out.print("\nHow many acres do you wish to sell?\n");
    //Get the user's input and save it
    int acresToSell;
    acresToSell = keyboard.nextInt();
    //Call the sellLand() method in the control layer to sell the land
    try {CropControl.sellLand(landPrice, acresToSell, theCropData);}//error because the parameters we are passing here are different from the parameters needed by that method
    //i.e. sellLand(int landPrice, int acresToSell, CropData cropData)
  catch (Exception e) {
      System.out.println("I am sorry master, I cannot do this.\n");
               System.out.println(e.getMessage());
               paramsNotOk = true;
  }
  }while(paramsNotOk); 
      
  }

  //@Jem
  public static void feedPeopleView(){
    //Get the cost of the land for this round
    boolean paramsNotOk;
    do {
        paramsNotOk = false;
    //Prompt user to enter the amount of acres to sell
    System.out.print("\nHow many bushles of grain do you want to give to people?");
    System.out.print("\n*Hint* Each person needs 20 bushels of wheat to thrive.\n");
    //Get the user's input and save it
    int toFeed;
    toFeed = keyboard.nextInt();
    //Call the feedPeople() method in the control layer to sell the land
    try {CropControl.feedPeople(toFeed, theCropData);}
    catch (Exception e) {
        System.out.println("I am sorry master, I cannot do this.\n");
               System.out.println(e.getMessage());
               paramsNotOk = true;
    }
    }while(paramsNotOk);  
  }


  //The plantsCropView method()
    //Purpose: allows user to input acres of land to plant with seed
    //Parameters: none
    //Returns: none
  //@Jem
  public static void plantCropsView(){
    //Prompt user to enter the number of acres to plant with seed
    System.out.print("\nHow many acres of land do you want to plant with seed?");
    System.out.print("\n*Hint* 1 person can only manage 10 acres of land.");
    System.out.print("\n*Hint* 1 bushel of wheat can be used to plant on 2 acres of land.\n");
    //Get the user's input and save it
    int toPlant;
    toPlant = keyboard.nextInt();
    //Call the plantCrop() method in the control layer to plant crop
    CropControl.plantCrop(toPlant, theCropData);
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
   System.out.print("\nThe number of wheat in store is " + wheat + "\n");

  }

     public static void runCropsView()
    {
        //Jem
        displayCropsReportView();  
        
        //by Jacalyn -- You always tithe first
        payOfferingView();
        
        //call the buyLandView() method
        buyLandView();

        //call the sellLandView() method
        sellLandView();

        //by Clayton
        feedPeopleView();

        //Jem
        plantCropsView();

         //Jem
        showStarvedView();
    }
}
