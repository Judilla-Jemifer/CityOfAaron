
package byu.cit260.cityOfAaron.model;

/**
 *
 * @authors Jemifer/Jacalyn/Clayton
 */
 import java.io.Serializable;

 public class CropData implements Serializable{
 //attributes
   private int year;
   private int population;
   private int acresOwned;
   private int cropYield;
   private int wheatInStore;
   private int numberWhoDied;
   private int newPeople;
   private int harvest;
   private int harvestAfterOffering;
   private int offering;
   private int offeringBushels;
   private int peopleFed;
   private int acresToPlant;
   private int acresPlanted;
   private int numStarved;
   private int eatenByRats;
   private int wheatForPeople;
 //constructor
   public CropData(){}
 //getters
   public int getYear(){
     return year;
   }
   public int getPopulation(){
     return population;
   }
   public int getAcresOwned(){
     return acresOwned;
   }
   public int getCropYield(){
     return cropYield;
   }
   public int getWheatInStore(){
     return wheatInStore;
   }
   public int getNumberWhoDied(){
     return numberWhoDied;
   }
   public int getNewPeople(){
     return newPeople;
   }
   public int getHarvest(){
     return harvest;
   }
   public int getHarvestAfterOffering(){
     return harvestAfterOffering;
   }
   public int getOffering(){
     return offering;
   }
   public int getOfferingBushels(){
     return offeringBushels;
   }
   public int getPeopleFed(){
     return peopleFed;
   }
   public int getAcresToPlant(){
       return acresToPlant;
   }
   public int getAcresPlanted(){
     return acresPlanted;
   }
   public int getNumStarved(){
     return numStarved;
   }
   public int getEatenByRats(){
     return eatenByRats;
   }
   public int getWheatForPeople(){
     return wheatForPeople;
   }
 //setters

   public void setYear(int setYear){
     this.year = setYear;
   }
   public void setPopulation(int setPopulation){
     this.population = setPopulation;
   }
   public void setAcresOwned(int setAcresOwned){
     this.acresOwned = setAcresOwned;
   }
   public void setCropYield(int setCropYield){
     this.cropYield = setCropYield;
   }
   public void setWheatInStore(int setWheatInStore){
     this.wheatInStore = setWheatInStore;
   }
   public void setNumberWhoDied(int setNumberWhoDied){
     this.numberWhoDied = setNumberWhoDied;
   }
   public void setNewPeople(int setNewPeople){
     this.newPeople = setNewPeople;
   }
   public void setHarvest(int setHarvest){
     this.harvest = setHarvest;
   }
   public void setHarvestAfterOffering(int setHarvestAfterOffering){
     this.harvestAfterOffering = setHarvestAfterOffering;
   }
   public void setOffering(int setOffering){
     this.offering = setOffering;
   }
   public void setOfferingBushels(int setOfferingBushels){
     this.offeringBushels = setOfferingBushels;
   }
   public void setPeopleFed(int setPeopleFed){
     this.peopleFed = setPeopleFed;
   }
   public void setAcresToPlant(int setAcresToPlant){
       this.acresToPlant = setAcresToPlant;
   }
   public void setAcresPlanted(int setAcresPlanted){
     this.acresPlanted = setAcresPlanted;
   }
   public void setNumStarved(int setNumStarved){
     this.numStarved = setNumStarved;
   }
   public void setEatenByRats(int setEatenByRats){
     this.eatenByRats = setEatenByRats;
   }
   public void setWheatForPeople(int setWheatForPeople){
     this.wheatForPeople = setWheatForPeople;
   }

 }
