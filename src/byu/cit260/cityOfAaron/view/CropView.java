package byu.cit260.cityOfAaron.view;

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

    //Purpose: interface with the user input for buying land
    public static void buyLandView(){
      //Get the cost of land for this round
      int landPrice = CropControl.CalcLandCost();
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
    }//close buyLandView

    public static void payOfferingView() {
        //Prompt for user to input amount of Offerings to pay
        System.out.format("\n*Hint* The amount of tithing you offer will directly affect your harvest " +
                "\noutcome and how much of your storage is eaten by rats.\n");
       boolean paramsNotOk;
       do {
           paramsNotOk = false;
           System.out.print("\nWhat percentage of your harvest would you like to contribute to your tithe offering?\n");
           int offering;
            offering = keyboard.nextInt();
            try {CropControl.setOffering(offering, theCropData);}
           catch (Exception e) {
               System.out.println("I am sorry master, I cannot do this.\n");
               System.out.println(e.getMessage());
               paramsNotOk = true;
            }
        } while(paramsNotOk);
        System.out.print("\nYou are offering " + theCropData.getOffering() +"%.");
        System.out.print("\nYou have offered " + theCropData.getOfferingBushels() + " bushels to your God.");
        System.out.print("\nYou have " + theCropData.getWheatInStore() + " remaining bushels of wheat.");
    }//close payOfferingView

    public static void sellLandView(){
      //Get the cost of the land for this round
      int landPrice = CropControl.CalcLandCost();
      boolean paramsNotOk;
      do { paramsNotOk = false;
        //Prompt user to enter the amount of acres to sell
        System.out.print("\nHow many acres do you wish to sell?\n");
        //Get the user's input and save it
        int acresToSell;
        acresToSell = keyboard.nextInt();
        //Call the sellLand() method in the control layer to sell the land
        try {CropControl.sellLand(landPrice, acresToSell, theCropData);
        }
        catch (Exception e) {
          System.out.println("I am sorry master, I cannot do this.\n");
          System.out.println(e.getMessage());
          paramsNotOk = true;
        }
      }while(paramsNotOk);
    }//close sellLandView

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
    }//close feedPeopleView

    //Purpose: allows user to input acres of land to plant with seed
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

    //Purpose: shows the number of people in the population that starved
    public static void showStarvedView() throws Exception{
      //Calculate how many people were adequately fed during the year
      int wheatForPeople = theCropData.getWheatForPeople();
      int peopleFed = wheatForPeople / BUSHELS_PER_PERSON;
      //Since it takes 20 busheles of wheat (Bushels_per_person) to feed one person
      //I divided wheatForPeople by bushels per person or 20
      int population = theCropData.getPopulation();
      boolean paramsNotOk;
      do {
        paramsNotOk = false;
        try {CropControl.showStarved(peopleFed, population, theCropData);
        }
        catch (Exception e)
        {
        System.out.println("Game Over.\n");
        System.out.println(e.getMessage());
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
        paramsNotOk = true;
        }
      }while(paramsNotOk);
    }//close showStarvedView

    public static void newYearView() {
      boolean paramsNotOk;
      int year = 1;
      do {
        paramsNotOk = false;
        //call the newYear method
        try{CropControl.newYear(year, theCropData);
        }
        catch (Exception e) {
        System.out.println("You survived and a statue is built in your honour.\n");
        System.out.println(e.getMessage());
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
        paramsNotOk = true;
        }
      }while(paramsNotOk);
    }//close newYearView

      //Purpose: to display the crops report
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
      int offering = theCropData.getOfferingBushels();
      //bushles of wheat eaten by rats here
      int wheat = theCropData.getWheatInStore();
      int landPrice = CropControl.CalcLandCost();

      //display values
      System.out.print("\nThe year of your leadership is now " + yearNumber);
      System.out.print("\nThe number of people who starved is " + peopleStarved);
      System.out.print("\nThe number of people who came to the city is " + newComers);
      System.out.print("\nThe current population is " + currentPopulation);
      System.out.print("\nThe number of acres of cropland owned by the city is " + acresOwned);
      System.out.print("\nThe number of bushels paid in offerings last year was " + offering);
      System.out.print("\nThe number of wheat in store is " + wheat + "\n");
      System.out.format("\nLand is selling for %d bushels per acres.%n",landPrice);
    }//close displayCropsReportView

    public static void runCropsView() throws Exception
    {
        displayCropsReportView();
        payOfferingView();
        buyLandView();
        sellLandView();
        feedPeopleView();
        plantCropsView();
        showStarvedView();
        newYearView();
        //We now get a random population growth
       CropControl.populationGrowth(theCropData);

    }



    }//close runCropsView

//end of class

