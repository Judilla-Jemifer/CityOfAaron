package byu.cit260.cityOfAaron.control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byu.cit260.cityOfAaron.model.*;

public class GameControl {

    //size of the Locations array
  private static final int MAX_ROW = 5;
  private static final int MAX_COL = 5;

  //Refrence to a Game object
  private static Game theGame;

  public static void createNewGame(String  pName) {
      
      //Created the game object.  Save it in the main driver file
      theGame = new Game();
      CityOfAaron.setCurrentGame(theGame);
      
     //create the player object.  Save it in the game object
     Player thePlayer = new Player();
     thePlayer.setPlayerName(pName);
     theGame.setPlayer(thePlayer);
     
     //Calls
     createCropDataObject();
     createAnimalList();
     createToolList();
     createProvisionList();
     createMap();
  }

  public static void createCropDataObject() {

    CropData theCrops = new CropData();

    theCrops.setYear(0);
    theCrops.setPopulation(100);
    theCrops.setNewPeople(5);
    theCrops.setCropYield(3);
    theCrops.setNumberWhoDied(0);
    theCrops.setOffering(10);
    theCrops.setWheatInStore(2700);
    theCrops.setAcresOwned(1000);
    theCrops.setAcresPlanted(1000);
    theCrops.setHarvest(3000);
    theCrops.setOfferingBushels(300);
    theCrops.setAcresPlanted(1000);

    theGame.setCropData(theCrops);
  }

  public static void createAnimalList() {
    ArrayList<ListItem> animals = new ArrayList<>();

    animals.add(new ListItem("chickens",13));
    animals.add(new ListItem("cows",6));
    animals.add(new ListItem("pigs",3));
    animals.add(new ListItem("horsies",7));
    animals.add(new ListItem("oxen",12));
    animals.add(new ListItem("chihuahuas", 5)); //It's historical!  --Jacalyn

    theGame.setAnimals(animals);
  }

  public static void createToolList() {
    ArrayList<ListItem> tools = new ArrayList<>();

    tools.add(new ListItem("hammers",10));
    tools.add(new ListItem("nails",10000));
    tools.add(new ListItem("saws",5));
    tools.add(new ListItem("tape measures",10));
    tools.add(new ListItem("dremels",1));
    tools.add(new ListItem("screwdrivers", 3));

    theGame.setTools(tools);
  }

  public static void createProvisionList() {
    ArrayList<ListItem> provisions = new ArrayList<>();//erasing extra ListItem as per Dev Forum -Jem

    provisions.add(new ListItem("bread",1)); //Christ is the Bread of Life --Jacalyn
    provisions.add(new ListItem("water",2)); //Christ is the Living Water --Jacalyn

    theGame.setProvisions(provisions);
  }

  //The createMap method
  //Purpose: creates the location objects and the map
  //Parameters: none
  //Returns: none
  public static void createMap() {

      //create the Map object, it is 5x5
      //refer to the Map constructor
    Map theMap = new Map(MAX_ROW, MAX_COL);

    //create a string that will go in the location objects that contain the river
    String river = "\n You are on the river. " +
      "\n The river is the source of life for our city. " +
      "\n The river marks the eastern boundary of the city; " +
      "\n it is wilderness to the east. ";

    //create a new Location object
    Location loc = new Location();

    //set the description and symbol
    loc.setDescription(river);
    loc.setSymbol("~~~");

    //set this location object in each cell of the array in column 4
    for(int i = 0; i < MAX_ROW; i++){
      theMap.setLocation(i,4,loc);
    }
    
    //define the string for a farm land location
    String farmland = "\nYou are on the fertile banks of the River." +
            "\nIn the spring this low farmland floods and is covered with rich" +
            "\nnew soil.  Wheat is planted as far as you can see.";
    
    //set a farmland location with a hint 
    loc = new Location();
    loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
    loc.setSymbol("!!!");
    theMap.setLocation(0,2, loc);
    
    // define the string for a farm land location
    // I added market here. What do you think? --Jem
    String market = "\nYou are in the market where people interact with each other to trade." +
    "\nThe market is full of merchants and farm owners who are seeling their lands and other items." +
    "\nFeel free to interact with the people here"; 
    
    // set a farmland location with a hint 
    loc = new Location();
    loc.setDescription(market + "\nTwenty bushels can feed one person in the population.");
    loc.setSymbol("!!!");
    theMap.setLocation(1, 3, loc);
    
    //I feel like we need a Temple.  Did you expect less from me? HAHA Jacalyn
    // set a Temple with a hint
    String temple = "\n The ancient Americans built Temples to worship God";
    loc = new Location();

    //set the description and symbol
    loc.setDescription(temple + 
            "\nWhen you pay tithes, you are blessed with a bountiful crop protected from vermin.");
    loc.setSymbol("+++");
    theMap.setLocation(2, 2, loc);
    
    theGame.setMap(theMap);
            }
}