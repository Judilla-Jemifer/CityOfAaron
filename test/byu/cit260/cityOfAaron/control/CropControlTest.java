
//compiled by Jacalyn via the Tools create/update test function in NetBeans
package byu.cit260.cityOfAaron.control;
import byu.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @authors Jacalyn,Jemifer,Clayton
 */
public class CropControlTest {

    //@org.junit.Test
    public CropControlTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of CalcLandCost method, of class CropControl.
     */

    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.CalcLandCost();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */

    @Test
    public void testSellLand() {
        System.out.println("sellLand");

          // --- Test case 1 --- Jem
        System.out.println("\tTest case 1");

        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);


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


        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
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
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
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
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2000);
        // define the input variables
        landPrice = 10;
        acresToSell = 2000;

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
       cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2000);
        // define the input variables
        landPrice = 10;
        acresToSell = 0;

        expResult = 2000;

        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);

        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");


}

    /**
     * Test of payOffering method, of class CropControl.
     */
    @Test
    public void testPayOffering() {
        System.out.println("payOffering");
        CropData cropData = new CropData();
        cropData.setCropYield(20);
        int offering = 10;
        //CropData cropData = null;
        long expResult = 2;
        long result = CropControl.payOffering(offering, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");

          // --- Test case 1 --- @author Jem
        System.out.println("\tTest case 1 for Valid");

        CropData cropData = new CropData();
        cropData.setWheatInStore(2700);
     
        // define the input variables
        int wheatForPeople = 1300;
      

        int expResult = 1400;

        //call the method
        int result = CropControl.feedPeople(wheatForPeople, cropData);

        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
       

    // --- Test case 2 ---
        System.out.println("\tTest case 2 for Invalid");


        cropData.setWheatInStore(2700);
      
        // define the input variables
        wheatForPeople = -100;
      

        expResult = -1;

        //call the method
        result = CropControl.feedPeople(wheatForPeople, cropData);

        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        

        // --- Test case 3 ---
        System.out.println("\tTest case 3 for Invalid");
        
        cropData.setWheatInStore(2700);
      
        // define the input variables
        wheatForPeople = 2900;
      

        expResult = -1;

        //call the method
        result = CropControl.feedPeople(wheatForPeople, cropData);
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        // --- Test case 4 ---
        System.out.println("\tTest case 4 for Boundary");
        
        cropData.setWheatInStore(2700);
      
        // define the input variables
        wheatForPeople = 2700;
      

        expResult = 0;

        //call the method
        result = CropControl.feedPeople(wheatForPeople, cropData);

        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        // --- Test case 5 ---
        System.out.println("\tTest case 5 for Boundary");
        
        cropData.setWheatInStore(2700);
      
        // define the input variables
        wheatForPeople = 0;
      

        expResult = 2700;

        //call the method
        result = CropControl.feedPeople(wheatForPeople, cropData);

        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
