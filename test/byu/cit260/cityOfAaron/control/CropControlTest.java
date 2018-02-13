//compiled by Jacalyn via the Tools create/update test function in NetBeans
package byu.cit260.cityOfAaron.control;
import byu.cit260.cityOfAaron.control.CropControl;
import byu.cit260.cityOfAaron.control.CropControl;
import byu.cit260.cityOfAaron.model.CropData;

/**
 *
 * @author Jacalyn
 */
public class CropControlTest {
    
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

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(int expResult, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
