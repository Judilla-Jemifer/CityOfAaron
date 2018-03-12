package byu.cit260.cityOfAaron.control;

/**
 * @authors Jacalyn/Jemifer/Clayton
 */

import byu.cit260.cityOfAaron.model.*;
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
    public static int sellLand(int landPrice, int acresToSell, CropData cropData){
      //if acresToSell < 0, return -1
      if(acresToSell < 0){
        return -1;
      }
      //if acresToSell > acresOwned, return -1
      int owned = cropData.getAcresOwned();
      if(acresToSell > owned){
        return -1;
      }
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
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData){
      //if acresToBuy < 0, return -1
      if(acresToBuy < 0){
        return -1;
       
      }
      
      //if acrestToBuy > (wheatInStore/landPrice), return -1
      int wheat = cropData.getWheatInStore();
      int money = wheat/landPrice;
      if (acresToBuy > money) {
          return -1;
      }
      //if acresToBuy > population*10, return -1
      
      int population = cropData.getPopulation();
      if(acresToBuy > population*PEOPLE_PER_ACRE){
        return -1;
        
      }
      //acresOwned = acresOwned + acresToBuy
      int owned = cropData.getAcresOwned();
      owned += acresToBuy;
      cropData.setAcresOwned(owned);
      
      //wheatInStore = wheatInStore - (acresToBuy*landPrice)
      wheat += (acresToBuy * landPrice);
      cropData.setWheatInStore(wheat);
      //return acresOwned
      return owned;
    } //close sellLand

    
    
    
    /*
    using offering percentage input from user, divide integer by 100 to convert value to percentage decimal
    using harvest amount collected, multiply by percentage of offering to calculate amount of harvest to be offered as tithes
    return calculated offering if valid, or return -1 if invalid
    */
    public static int payOffering(int offeringBushels, int wheatInStore, CropData cropData){
      //if offering is less than zero or more than 100, return error code -1
      if(offeringBushels < 0 || offeringBushels > 100){
        return -1;
      }
      //converts whole # to percentage
      double offeringPercentage = offeringBushels / 100.0;
      //get cropYield from cropData instance
      int cropYield = cropData.getCropYield();
      //get Wheat in Store so you can calculate how much wheat there is after paying offering
      int wheat = cropData.getWheatInStore();
      int payOffering = (wheatInStore - offeringBushels);
      return wheatInStore;
      //return offeringBushels
     // return offeringBushels;
    } //close payOffering

    /* @author Jem
  The feedPeople method
  Purpose: To allocate wheat for feeding people
  Parameters: The wheat for people (number of bushels of grain to be given to people)
  Returns: the wheat in store after the wheat for people is set aside
  Pre-conditions: wheat for people must be positive and wheat in store should be > wheat for people
  */
    public static int feedPeople(int wheatForPeople, CropData cropData){
      //if wheatForPeople < 0, return -1
      if(wheatForPeople < 0){
        return -1;
      }
      //if wheatInStore <wheatForPeople, return -1
      int wheat = cropData.getWheatInStore();
      if(wheat < wheatForPeople){
        return -1;
      }
      //wheatInStore = wheatInStore - whjeatForPeople
      wheat -= wheatForPeople;
      cropData.setWheatInStore(wheat);
      cropData.setWheatForPeople(wheatForPeople);

      //return wheatInStore
      return wheat;
    } //close feedPeople

    /* @Jem
  The buyLand method
  Purpose: To buy land
  Parameters: the price of land, the number of acres to buy, and a
  reference to a CropData object
  Returns: the acres owned after the sale
  Pre-conditions: acres to sell must be positive, acresToBuy <= (wheatInStore/landPrice),
    and acresOwned after the sale <= population*10
  */
    public static int showStarved(int peopleFed, int population, CropData cropData){
      //if(peopleFed < population) return starved
      if(peopleFed < population){
        int starved = population - peopleFed;
        cropData.setNumStarved(starved);
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
      int currentPopulation = population - starved;
      cropData.setPopulation(currentPopulation);
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


}
