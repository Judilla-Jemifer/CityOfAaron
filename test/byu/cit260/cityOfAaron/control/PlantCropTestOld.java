
package byu.cit260.cityOfAaron.control;

import byu.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacalyn
 */
public class PlantCropTestOld {
    
    public PlantCropTestOld() {
    }

    /**
     * Test of acresPlanted method, of class PlantCrop.
     */
    @Test
    public void testAcresPlanted() {
        System.out.println("acresPlanted");
        //Test Case 1 - Valid 
        System.out.println("\tTest Case 1 Valid");
        //input Variables
        CropData cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(450);
        
        //CropData cropData = new CropData();
      
        int expResult = 9100;
        
        //call
       
        int result = PlantCrop.acresPlanted(cropData);
        assertEquals(expResult, result);
        
        //Test Case 2 - Invalid 
        System.out.println("\tTest Case 2 Invalid");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(-20);
        
        //CropData cropData = new CropData();
      
        expResult = -1;
        
        //call
       
        result = PlantCrop.acresPlanted(cropData);
        assertEquals(expResult, result);
        
        //Test Case 3 - Invalid 
        System.out.println("\tTest Case 3 Invalid");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(502);
        
        //CropData cropData = new CropData();
      
        expResult = -1;
        
        //call
       
        result = PlantCrop.acresPlanted(cropData);
        assertEquals(expResult, result);
        
        //Test Case 4 - Boundary 
        System.out.println("\tTest Case 4 Boundary");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(0);
        
        //CropData cropData = new CropData();
      
        expResult = 10000;
        
        //call
       
        result = PlantCrop.acresPlanted(cropData);
        assertEquals(expResult, result);
       
        //Test Case 5 - Boundary 
        System.out.println("\tTest Case 5 Boundary");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresPlanted(500);
        
        //CropData cropData = new CropData();
      
        expResult = 9000;
        
        //call
       
        result = PlantCrop.acresPlanted(cropData);
        assertEquals(expResult, result);
    }
    
}
