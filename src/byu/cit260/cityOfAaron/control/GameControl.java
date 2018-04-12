package byu.cit260.cityOfAaron.control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byu.cit260.cityOfAaron.model.*;
import byu.cit260.cityOfAaron.view.ErrorView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

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

public static void saveGame(Game game, String filePath) throws Exception {
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            // write the game object out to file
            output.writeObject(game);
        }
        catch (Exception e) {
            System.out.println("\nThere was an error writing the saved game file");
    }
}

  //Purpose: load a saved game from disk
  //Side Effect: The game reference in the driver is updated
  public static void getSavedGame(String filePath) {
    Game theGame = null;
    try (FileInputStream fips = new FileInputStream(filePath)) {
        ObjectInputStream input = new ObjectInputStream(fips);
        theGame = (Game) input.readObject();
        CityOfAaron.setCurrentGame(theGame);
    }
    catch(Exception e) {
        System.out.println("\nThere was an error reading the saved game file. Please check the name and try again.");
    }
}

  public static void createCropDataObject() {
    CropData theCrops = new CropData();

    theCrops.setYear(1);
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
    animals.add(new ListItem("horses",7));
    animals.add(new ListItem("oxen",12));
    animals.add(new ListItem("chihuahuas", 5));

    theGame.setAnimals(animals);
  }

  //Save the Animal list to a file
  public static void saveAnimalList(String outputLocation)  {
       ArrayList<ListItem> animals = theGame.getAnimals();
      try (PrintWriter out = new PrintWriter(outputLocation)) {
          out.println("\n\n **********Animal List Report**********");
         out.printf("%n%-10s%10s","  Animal  ","Quantity");
          out.printf("%n%-10s%10s","**********","**********");
          for (ListItem item : animals) {
              out.printf("%n%-10s%10d", item.getName(), item.getNumber());
          }
      } catch (IOException ex) {
          System.out.println("I/O Error" + ex.getMessage());
      }
  }

    //Save the List of tools to the disk
    // @param outputLocation
  public static void saveToolList(String outputLocation)  {
       ArrayList<ListItem> tools = theGame.getTools();

      try (PrintWriter out = new PrintWriter(outputLocation)) {
          out.println("\n\n **********Tool List Report**********");
         out.printf("%n%-10s%10s","  Tool  ","Quantity");
          out.printf("%n%-10s%10s","**********","**********");
          for (ListItem item : tools) {
              out.printf("%n%-10s%10d", item.getName(), item.getNumber());
          }
      } catch (IOException ex) {
           System.out.println("I/O Error" + ex.getMessage());
      } finally {
          if (CityOfAaron.outFile !=null) {
              CityOfAaron.outFile.close();
          }
      }
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

//by clayton
  public static void saveProvisionList(String outputLocation)  {
       ArrayList<ListItem> provisions = theGame.getProvisions();

      try (PrintWriter out = new PrintWriter(outputLocation)) {
          out.println("\n\n **********Provision List Report**********");
         out.printf("%n%-10s%10s","  Provision  ","Quantity");
          out.printf("%n%-10s%10s","**********","**********");
          for (ListItem item : provisions) {
              out.printf("%n%-10s%10d", item.getName(), item.getNumber());
          }
      } catch (IOException ex) {
           System.out.println("I/O Error" + ex.getMessage());
      } finally {
          if (CityOfAaron.outFile !=null) {
              CityOfAaron.outFile.close();
          }
      }
  }
  

  //Purpose: creates the location objects and the map
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
      theMap.setLocation(i,3,loc);
    }
    //define the string for a farm land location
    String farmland = "\nYou are on the fertile banks of the River." +
            "\nIn the spring this low farmland floods and is covered with rich" +
            "\nnew soil.  Wheat is planted as far as you can see.";
    //set a farmland location with a hint
    loc = new Location();
    loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
    loc.setSymbol("!!!");
<<<<<<< HEAD
    for(int i = 0; i < MAX_ROW; i++){
      theMap.setLocation(i,2,loc);
    }
    
     //set a farmland location with a hint 
    loc = new Location();
    loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
    loc.setSymbol("!!!");
    for(int i = 0; i < MAX_ROW; i++){
      theMap.setLocation(i,4,loc);
    }
   //define the string for the village
    String village = "\nYou are in the village where people live." +
            "\nEvery day, these people work together to build the village." +
            "\nThey plant seed and harvest when needed.";
    
    //set a vilage location 
    loc = new Location();
    loc.setDescription(village + "\nEach person consumers 20 bushels per year.");
    loc.setSymbol("oOo");
    for(int i = 0; i < 3; i++){
      theMap.setLocation(i,0,loc);
    }
    
    //set a vilage location 
    loc = new Location();
    loc.setDescription(village + "\nEach person consumers 20 bushels per year.");
    loc.setSymbol("oOo");
    for(int i = 0; i < 3; i++){
      theMap.setLocation(i,1,loc);
    }
    //define the string for a desert location
    String desert = "\nYou are on the desert." +
            "\nNobody lives here because it's too hot in here" +
            "\nBetter move to other location.";
    
    //set a location location with a hint 
    loc = new Location();
    loc.setDescription(desert + "\nYou must always make sure not to starve the people.");
    loc.setSymbol("...");
    for(int i = 0; i < 2; i++){
      theMap.setLocation(0,i,loc);
    }
=======
    theMap.setLocation(0,2, loc);
>>>>>>> f69b3d47f87f49fe82abc343610c997ba5978695
    // define the string for a farm land location
    // I added market here. What do you think? --Jem
    String market = "\nYou are in the market where people interact with each other to trade." +
    "\nThe market is full of merchants and farm owners who are seeling their lands and other items." +
    "\nFeel free to interact with the people here";
    // set a farmland location with a hint
    loc = new Location();
    loc.setDescription(market + "\nTwenty bushels can feed one person in the population.");
<<<<<<< HEAD
    loc.setSymbol("l^l");
    theMap.setLocation(1, 2, loc);
    
=======
    loc.setSymbol("!!!");
    theMap.setLocation(1, 3, loc);
>>>>>>> f69b3d47f87f49fe82abc343610c997ba5978695
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

}//end of class
