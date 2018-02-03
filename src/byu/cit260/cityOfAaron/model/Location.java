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

 public class Location implements Serializable{
   //attribute
   private String description;
   private String symbol;
   //constructor
   public Location(){}
   //getter and setter
   public String getDescription(){
     return description;
   }
   public void setDescription(String description){
     this.description = description;
   }
   public String getSymbol(){
     return symbol;
   }
   public void setSymbol(String symbol){
       this.symbol = symbol;
   }
   @Override
   public String toString() {
       return "You are in " + description;
   }
 }
