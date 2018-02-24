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
        int acresToPlant = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = PlantCrop.plantCrop(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
