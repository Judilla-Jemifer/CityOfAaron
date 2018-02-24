
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
    
    public static int plantCrop(int acresToPlant, CropData cropData){
        
        int owned = cropData.getAcresOwned();
        int wheat = cropData.getWheatInStore();
        int plant = cropData.getAcresToPlant();
        
        //If acresPlanted <0, return -1
        if(acresToPlant < 0) {
            return -1;
        }
        
        //if acresPlanted >(acresOwned or 2*wheatInStore), return -1
        
        if(acresToPlant > owned) {
            return -1;
        }
        if(acresToPlant > wheat * 2) {
            return -1;
        }
        
        // wheatLeft = wheatInStore - (acresToPlant * 2)
        int wheatLeft = wheat - acresToPlant * 2;
        
        cropData.setWheatInStore(wheatLeft); 
        cropData.setAcresPlanted(acresToPlant);
                
        return wheatLeft;
    }

    
}
