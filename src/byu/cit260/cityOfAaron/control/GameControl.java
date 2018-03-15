package byu.cit260.cityOfAaron.control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byu.cit260.cityOfAaron.model.*;

public class GameControl{

  private static final int MAX_ROW = 5;
  private static final int MAX_COL = 5;

  private static Game theGame;

  public static void createNewGame(String pName){

  }

  theGame = new Game();
  CityOfAaron.setCurrentGame(Game theGame);

  Player thePlayer = new Player();
  thePlayer.setPlayerName(pName);
  theGame.setPlayer(thePlayer);

  public static void createCropDataObject(){

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

  public static void createAnimalList(){
    ArrayList<ListItem> animals = new ArrayList<ListItem>();

    animals.add(new ListItem("chickens",13));
    animals.add(new ListItem("cows",6));
    animals.add(new ListItem("pigs",3));
    animals.add(new ListItem("horsies",7));
    animals.add(new ListItem("oxen",12));

    theGame.setAnimals(animals);
  }

  public static void createToolsList(){
    ArrayList<ListItem> tools = new ArrayList<ListItem>();

    tools.add(new ListItem("hammers",10));
    tools.add(new ListItem("nails",10000));
    tools.add(new ListItem("saws",5));
    tools.add(new ListItem("tape measures",10));
    tools.add(new ListItem("dremels",1));

    theGame.setTools(tools);
  }

  public static void createProvisionsList(){
    ArrayList<ListItem> provisions = new ArrayList<ListItem>();

    provisions.add(new ListItem("example1",1));
    provisions.add(new ListItem("example2",2));

    theGame.setProvisions(provisions);
  }

  public static void createMap(){

    Map theMap = new Map(MAX_ROW, MAX_COL);

    String river = "\n You are on the river. " +
      "\n The river is the source of life for our city. " +
      "\n The river marks the eastern boundary of the city; " +
      "\n it is wilderness to the east. ";

    Location loc = new Location();

    loc.setDescription(river);
    loc.setSymbol("~~~");

    for(int i = 0; i < MAX_ROW; i++){
      theMap.setLocation(i,4,loc);
    }
  }



}
