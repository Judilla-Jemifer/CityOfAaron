//compiled by Jacalyn via the Tools create/update test function in NetBeans
package byu.cit260.cityOfAaron.control;
import byu.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacalyn
 */
public class CropControlTest {
   
    //@org.junit.Test  
    public CropControlTest() {
    }

    /**
     * Test of CalcLandCost method, of class CropControl.
     */
    
    public void testCalcLandCost() {
        System.out.println("CalcLandCost");
        int expResult = 0;
        int result = CropControl.CalcLandCost();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
      
    @org.junit.Test
    public void testSellLand() {
        System.out.println("sellLand");
        
        
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
    
        // define the input variables
        int landPrice = 20;
        int acresToSell = 10;
       
        int expResult = 2790;
        
        //call the method
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
            
           
    // --- Test case 2 ---
        System.out.println("\tTest case 2");
       
        // define the input variables
        landPrice = 20;
        acresToSell = -5;
       
        expResult = -1;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
       
        // define the input variables
        landPrice = 20;
        acresToSell = 3000;
       
        expResult = -1;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
       
        // define the input variables
        landPrice = 20;
        acresToSell = 2800;
       
        expResult = 0;
        // I think we're having problems here wwhen I test it -- Jem
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
       
        // define the input variables
        landPrice = 10;
        acresToSell = 0;
       
        expResult = 2800;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    
}
}
