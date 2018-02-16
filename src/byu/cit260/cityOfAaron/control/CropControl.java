package byu.cit260.cityOfAaron.control;

/**
 *
 * @author ct
 */

import byu.cit260.cityOfAaron.model.CropData;
import java.util.Random;

public class CropControl {

  //constants
  private static final int LAND_BASE = 17;
  private static final int LAND_RANGE = 10;

  //random number generator
  public static Random random = new Random();

  //calcLandCost method
  //Purpose: to calculate a random land cost between 17 to 26 bushels per acre
  //Parameters: none
  //Returns: the land cost
public static int CalcLandCost(){
  int landPrice = random.nextInt(LAND_RANGE)+ LAND_BASE;
    // nextInt is a standard method from the imported library Random
  return landPrice;
}

// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and a
  // reference to a CropData object
// Returns: the acres owned after the sale
// Pre-conditions: acres to sell must be positive
  // and <= acresOwned
    public static int sellLand(int landPrice, int acresToSell, CropData, cropData){

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

    }
}

