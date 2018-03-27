package byu.cit260.cityOfAaron.model;
import byu.cit260.cityOfAaron.model.*;
 /*
  *City of Aaron*
  */

 import java.io.Serializable;
 import java.util.ArrayList;

 public class Game implements Serializable{
 //attributes
   private  Map theMap;
   private  Player thePlayer; //it's private Player aPlayerRef in slide 14 week 11 but I think this is just the same -- Jem
   private  CropData cropData;
   private  CropData theCrops = null; 
   private  TeamMember team[];
   private  ArrayList<ListItem> animals;
   private  ArrayList<ListItem> tools;
   private  ArrayList<ListItem> provisions;
   private boolean done = false;  // added this per slide 14 of week11 -Jem
   
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