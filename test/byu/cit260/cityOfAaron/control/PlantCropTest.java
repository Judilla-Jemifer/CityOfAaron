
package byu.cit260.cityOfAaron.control;

import byu.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacalyn
 */
public class PlantCropTest {
    
    public PlantCropTest() {
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
        
        int acresPlanted = 450;
        
        //CropData cropData = new CropData();
      
        int expResult = 9100;
        
        //call
       
        int result = PlantCrop.acresPlanted(wheatInStore, landOwned, cropData);
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
