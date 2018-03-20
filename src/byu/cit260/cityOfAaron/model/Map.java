package byu.cit260.cityOfAaron.model;
/**
 *
 * @author HP14-ab111tx
 */
 //by Clayton

 import java.io.Serializable;

 public class Map implements Serializable{
   //attributes
   private int rowCount; //number of rows
   private int colCount; //number of columns
   private Location[] [] locations;  //2-D array of Location objects

   //default Map constructor
   //Purpose: Set data members to default values
  //Parameters: none
  //Returns: none
   public Map() {};

   //parameterized Map constructor
   //Purpose: sets row adn column values
   //and creates an array of Location objects
   //Paramenters: row count and column count
   //Returns: none
     public Map(int _rows, int _cols){
       rowCount = _rows; 
       colCount = _cols;
       //Create the Location objects array
       locations = new Location[_rows][_cols];
     }

   //The getLocation method
   //Purpose: returns the location object at the given row and column
   //Parameters: a row and a column
   //Returns: a Location object
   public Location getLocation(int row, int col) {
       return locations[row][col];
 }
   //setLocation method
   //Purpose: stores a location object at the row and column
   //Parameters: a row and column, and a reference to a location object
   //Returns: void
   public void setLocation(int row, int col, Location _location) {
       locations[row][col] = _location;
   }
   
   public int getRowCount(){
     return rowCount;
   }
   //public void setRowCount(int rowCount){
     //this.rowCount = rowCount;
   //}//commented per week10 slide24

   public int getColCount(){
     return colCount;
   }
   //public void setColCount(int colCount){
     //this.colCount = colCount;
   //}//commented per week10 slide24
    //confused about this last class (within a class) -Clayton
     private static class locations {

         public locations() {
         }
     }
 }
