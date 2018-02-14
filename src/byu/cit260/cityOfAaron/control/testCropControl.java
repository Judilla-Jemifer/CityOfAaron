package byu.cit260.cityOfAaron.control;
import byu.cit260.cityOfAaron.control.CropControl;
import byu.cit260.cityOfAaron.model.CropData;

//test
public class testCropControl {
public void testSellLand(){
  System.out.println("sellLand");
  CropData theCrops = new CropData();
    theCrops.setWheatInStore(1000);
    theCrops.setAcresOwned(2800);
    int toSell = 10;
    int landCost = 15;
    int expResult = 2790;
    int result = CropControl.sellLand(landCost,toSell,theCrops);
      // i think the insturctor made a typo in the previous line
      // when he referenced CropDataControl, since the name of
      // the class we are testing is simply CropControl 
    assertEquals(expResult,result);
}

    private void assertEquals(int expResult, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}