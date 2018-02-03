/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.cityOfAaron.model;

/**
 *
 * @author HP14-ab111tx
 */
 //by Clayton

 import java.io.Serializable;

 public class Map implements Serializable{
   //attributes
   private int rowCount;
   private int colCount;
   private Location locations[][]; //i think this is right

   //constructor
   public Map(){}

   //getters and setters
   public int getRowCount(){
     return rowCount;
   }
   public void setRowCount(int rowCount){
     this.rowCount = rowCount;
   }

   public int getColCount(){
     return colCount;
   }
   public void setColCount(int colCount){
     this.colCount = colCount;
   }
   //how to do methods for double array? Ans://Maybe like this?? - Jem
   public Location[][] getLocations() {
       return locations;
 }
   //setLocations
   public void setLocations(Location Locations) {
       this.locations = locations;
   }

     private static class locations {

         public locations() {
         }
     }
 }
