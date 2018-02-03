
package byu.cit260.cityOfAaron.model;


 import java.io.Serializable;

 public class Player implements Serializable{
   //attribute
   private String name;
   //constructor
   public Player(){}
   //getter
   public String getName(){
     return name;
   }
   //setter
   public void setName(String name){
     this.name = name;
   }
   @Override
   public String toString() {
       return "Greetings to you, " + name;
   }
 }
