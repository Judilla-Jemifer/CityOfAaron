package byu.cit260.cityOfAaron.control;

/**
 * @authors Jacalyn/Jemifer/Clayton
 */

import byu.cit260.cityOfAaron.model.*;
import byu.cit260.cityOfAaron.view.*;
import exceptions.*;
import java.util.Random;

public class CropControl {

  //constants
  private static final int LAND_BASE = 17;
  private static final int LAND_RANGE = 10;
  private static final int ACRES_PER_BUSHEL = 2;
  private static final int PEOPLE_PER_ACRE = 10;
  private static final int YIELD_BASE = 3;
  private static final int YIELD_RANGE = 3;
  private static final int PHAROAH_RANGE = 3;
  private static final int PHAROAH_BASE = 0;
  private static final double TO_PERCENT = 100.0;
  private static final int GROWTH_RANGE = 5;
  private static final int BUSHELS_PER_PERSON = 20;

  //random number generator
  public static Random random = new Random();

  /*
  calcLandCost method
  Purpose: to calculate a random land cost between 17 to 26 bushels per acre
  Parameters: none
  Returns: the land cost
  */
  public static int CalcLandCost(){
    int landPrice = random.nextInt(LAND_RANGE)+ LAND_BASE;
    // nextInt is a standard method from the imported library Random
    return landPrice;
  } //close CalcLandCost

  /*
  The sellLand method
  Purpose: To sell land
  Parameters: the price of land, the number of acres to sell, and a
  reference to a CropData object
  Returns: the acres owned after the sale
  Pre-conditions: acres to sell must be positive
  and <= acresOwned
  */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) throws Exception {
      //if acresToSell < 0, return -1
      if(acresToSell < 0)throw new Exception("A negative value was input.");

      //if acresToSell > acresOwned, return -1
      int owned = cropData.getAcresOwned();
      if(acresToSell > owned)
          throw new Exception("There is insufficient acres owned to sell this much land.");

//acresOwned = acresOwned - acresToSell
      owned -= acresToSell;
      cropData.setAcresOwned(owned);
      //wheatInStore = wheatInStore + acresToSell * landPrice
      int wheat = cropData.getWheatInStore();
      wheat += (acresToSell * landPrice);
      cropData.setWheatInStore(wheat);
      //return acresOwned
      return owned;
    } //close sellLand

  /* @Jem
  The buyLand method
  Purpose: To buy land
  Parameters: the price of land, the number of acres to buy, and a
  reference to a CropData object
  Returns: the acres owned after the sale
  Pre-conditions: acres to sell must be positive, acresToBuy <= (wheatInStore/landPrice),
    and acresOwned after the sale <= population*10
  */
    public static void buyLand(int landPrice, int acresToBuy, CropData cropData)throws Exception{

      if(acresToBuy < 0) throw new Exception("A negative value was input.");

      int wheat = cropData.getWheatInStore();
      int money = wheat/landPrice;
      if (wheat < acresToBuy * landPrice)
          throw new Exception("There is insufficient wheat to buy this much land.");

      //add the number of acres to buy to current number of acres
      int owned = cropData.getAcresOwned();
      owned += acresToBuy;
      cropData.setAcresOwned(owned);

      //deduct the cost from wheatInStore
      wheat = cropData.getWheatInStore();
      wheat -= (acresToBuy * landPrice);
      cropData.setWheatInStore(wheat);
    } //close buyLand

    //The setOffering method
    //Purpose: To pay thithes and offerings
    //Paramenters: The perentage of tithes comes from wheat harvest
    //Pre-conditons: Tithes must be a positive number between 0 and 100 to represent the percentage
    public static int setOffering(int offering, CropData cropData) throws Exception {

        //if <  0 return -1
        if (offering < 0) throw new Exception ("You must input a positve percentage.");
        //if >100, return -1
        if (offering>100) throw new Exception ("You cannot pay more than 100 percent");
        cropData.setOffering(offering);
       int wheat = cropData.getWheatInStore();
       int offeringBushels = wheat/offering;
       cropData.setOfferingBushels(offeringBushels);
       int newWheat = wheat-offeringBushels;
       cropData.setWheatInStore(newWheat);
       return offering;
    }

    /* @author Jem
  The feedPeople method
  Purpose: To allocate wheat for feeding people
  Parameters: The wheat for people (number of bushels of grain to be given to people)
  Returns: the wheat in store after the wheat for people is set aside
  Pre-conditions: wheat for people must be positive and wheat in store should be > wheat for people
  */
    public static int feedPeople(int wheatForPeople, CropData cropData) throws Exception{
      //if wheatForPeople < 0, return -1
      if(wheatForPeople < 0) throw new Exception ("Must be more than zero");
      //if wheatInStore <wheatForPeople, return -1
      int wheat = cropData.getWheatInStore();
      if(wheat < wheatForPeople) throw new Exception("You cannot give more than you have to give");
      //wheatInStore = wheatInStore - whjeatForPeople
      wheat -= wheatForPeople;
      cropData.setWheatInStore(wheat);
      cropData.setWheatForPeople(wheatForPeople);

      //return wheatInStore
      return wheat;
    } //close feedPeople

    /* @Jem
  The showStarved method
  Purpose: To show number of people who starved and update the current population
  Parameters: the peoplefed, population, and a
  reference to a CropData object
  Returns: the number of people who starved
  Pre-conditions: none
  */
    public static int showStarved(int peopleFed, int population, CropData cropData){
      //if(peopleFed < population) return starved
      if(peopleFed < population){
        int starved = population - peopleFed;
        cropData.setNumStarved(starved);
        population -= starved;
        cropData.setPopulation(population);
        return starved;
      }

      //if(peopleFed > population) return population
       if(peopleFed > population){
        int populationFed = population;
        cropData.setPeopleFed(populationFed);
        return 0;
      }
      //Update value for the current population
      int starved = cropData.getNumStarved();
      //int currentPopulation = population - starved;
      //cropData.setPopulation(currentPopulation);
      return starved;
    }

    //Add PlantCrop only after it has been verified through testing.
    public static int plantCrop(int acresToPlant, CropData cropData){

        int owned = cropData.getAcresOwned();
        int wheat = cropData.getWheatInStore();
        int acresPlanted = cropData.getAcresPlanted();

        //If acresPlanted <0, return -1
        if(acresPlanted < 0) {
            return -1;
        }

        //if acresPlanted >(acresOwned or 2*wheatInStore), return -1

        if(acresPlanted > owned) {
            return -1;
        }
        if(acresPlanted > wheat * 2) {
            return -1;
        }

        // wheatLeft = wheatInStore - (acresPlanted * 2)
        int wheatLeft = wheat - acresPlanted * 2;

        cropData.setWheatInStore(wheatLeft);
        cropData.setAcresPlanted(acresToPlant);

        return wheatLeft;
    }//close plantCrop

    // The populationGrowth method
    // Purpose: To determine population for the new year
    // Parameters: none
    // Returns: the number of newPeople in the city of Aaron
    // Pre-conditions: population must be positive
    public static int populationGrowth(CropData cropData) {
        int population = cropData.getPopulation();
        int randomGrowth = random.nextInt(GROWTH_RANGE);
 
        //newPeople = random number * population
        int newPeople = population * randomGrowth/100;
        cropData.setNewPeople(newPeople);

        //population = population + newPeople
        population += newPeople;
        cropData.setPopulation(population);
        
        //return population
        return population;
    }

//Advances Years
public static int newYear(int year, CropData cropData) throws Exception{
   int newyear = cropData.getYear();
    if (newyear <= 9) {
        newyear++;
        cropData.setYear(newyear);
        return newyear;
    }
    if (newyear > 9) throw new Exception("Game over.");
    return newyear;
}
}
