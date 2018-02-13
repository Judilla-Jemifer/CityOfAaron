//compiled by Jacalyn via the Tools create/update test function in NetBeans
package byu.cit260.cityOfAaron.control;
import byu.cit260.cityOfAaron.control.CropControl;
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
      
    @org.junit.Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 0;
        int acresToSell = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
