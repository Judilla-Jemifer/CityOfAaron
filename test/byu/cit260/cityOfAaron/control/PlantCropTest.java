/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    @org.junit.Test
    public void testPlantCrop() {
        System.out.println("plantCrop");
        //Test Case 1 - Valid 
        System.out.println("\tTest Case 1 - Valid");
        //input Variables
        CropData cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        int acresToPlant = 450;
       
        int expResult = 9100;
        //
        int result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        //Test Case 2 - Invalid 
        System.out.println("\tTest Case 2 - Invalid");
        //input Variables
        cropData = new CropData();
        cropData.setWheatInStore(10000);
        cropData.setAcresOwned(500);
        cropData.setAcresToPlant(-20);
        
       
        expResult = -1;
        //
        result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
        
    }
    
}
