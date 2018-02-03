
package byu.cit260.cityOfAaron.model;
 /*
  *City of Aaron*
  */

  import java.io.Serializable;
  import java.util.ArrayList;

  public class Game implements Serializable{

    //Variables
    private Map theMap;
    private Player thePlayer;
    private CropData cropData;
    /*private TeamMember team[];
      //The Game class does not really need to include a reference to the TeamMember enum.
      // You can safely ignore this in the class diagram. - Roger deBry*/
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;
  //constructor
    public Game(){}
  //getters and setters
    public Map getTheMap(){
      return theMap;
    }
    public void setTheMap(Map theMap){
      this.theMap = theMap;
    }

    public Player getThePlayer(){
      return thePlayer;
    }
    public void setThePlayer(Player thePlayer){
      this.thePlayer = thePlayer;
    }

    public CropData getCropData(){
      return cropData;
    }
    public void setCropData(CropData cropData){
      this.cropData = cropData;
    }

    public ArrayList<ListItem> getAnimals(){
      return animals;
    }
    public void setAnimals(ArrayList<ListItem> animals){
      this.animals = animals;
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
  }
