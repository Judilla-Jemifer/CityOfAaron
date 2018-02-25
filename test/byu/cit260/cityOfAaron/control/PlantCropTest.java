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
     * Test of plantCrop method, of class PlantCrop.
     */
    @Test
    public void testPlantCrop() {
        System.out.println("plantCrop");
        //Test Case 1 - Valid 
        System.out.println("\tTest Case 1 - Valid");
        //input Variables
        CropData cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresToPlant(450);
       
        int expResult = 9100;
        
        int result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        //Test Case 2 - Invalid 
        System.out.println("\tTest Case 2 - Invalid");
        //input Variables
        
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresToPlant (-20);
        
        expResult = -1;
       
        result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        //Test Case 3 - Invalid 
        System.out.println("\tTest Case 3 - Invalid");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresToPlant(502);
        
        expResult = -1;
        
        result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        //Test Case 4 - Boundary 
        System.out.println("\tTest Case 4 Boundary");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresToPlant(0);
        
        expResult = 10000;

        result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
       
        //Test Case 5 - Boundary 
        System.out.println("\tTest Case 5 Boundary");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresToPlant(500);
      
        expResult = 9000;
  
        result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
    }
    
}
