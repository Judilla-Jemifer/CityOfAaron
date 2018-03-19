package byu.cit260.cityOfAaron.model;
import byu.cit260.cityOfAaron.model.*;
 /*
  *City of Aaron*
  */

 import java.io.Serializable;
 import java.util.ArrayList;

 public class Game implements Serializable{
 //attributes
   private static Map theMap;
   private static Player thePlayer;
   private static CropData cropData;
   private static CropData theCrops = null; 
   private static TeamMember team[];
   private static ArrayList<ListItem> animals;
   private static ArrayList<ListItem> tools;
   private static ArrayList<ListItem> provisions;
 //constructor
   public Game(){}
 //getters and setters
   public Map getTheMap(){
     return theMap;
   }
   
   public void setTheMap(Map theMap){
     this.theMap = theMap;
   }

   public Player getPlayer(){
     return thePlayer;
   }
   public void setPlayer(Player thePlayer){
     this.thePlayer = thePlayer;
   }

   public CropData getCropData(){
     return cropData;
   }
   public void setCropData(CropData cropData){
     this.cropData = cropData;
   }

   public CropData getCrop(){
     return theCrops;
   }
   public void setCrop(CropData _cropRef){
     theCrops = _cropRef;
   }

   public ArrayList<ListItem> getAnimals(){
     return animals;
   }
   public void setAnimals(ArrayList<ListItem> animals){
     this.animals = new ArrayList<ListItem>(animals);
   }

   public ArrayList<ListItem> getTools(){
     return tools;
   }
   public void setTools(ArrayList<ListItem> tools){
     this.tools = tools;
   }
   public ArrayList<ListItem> getProvisions(){
     return provisions;
   }
   public void setProvisions(ArrayList<ListItem> provisions){
     this.provisions = provisions;
   }

    public void setMap(Map theMap) {
       
    }
 }