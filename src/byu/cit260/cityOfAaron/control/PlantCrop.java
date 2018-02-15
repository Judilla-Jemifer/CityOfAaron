
package byu.cit260.cityOfAaron.control;
import byu.cit260.cityOfAaron.model.CropData;

/**
 * 
 * Method: Plant Crop
 * @author Jacalyn
 * Purpose: To plant crops on land
 * Parameters: How much land is owned, how much wheat is owned
 * Pre-req: acres to plant must be positive and less than or equal to the amount of land owned and 2x wheat
 * Returns: How much wheat is left over after planting 
 * 
 **/
public class PlantCrop {
    
    public static int acresPlanted(CropData cropData){
        
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
                
        return wheatLeft;
    }
    
}
