
package byu.cit260.cityOfAaron.model;
 /*
  *City of Aaron*
  */

 import java.io.Serializable;
 import java.util.ArrayList;

 public class Game implements Serializable{
 //attributes
   private Map theMap;
   private Player thePlayer;
   private CropData cropData;
   private TeamMember team[];
     //The Game class does not really need to include a reference to the TeamMember enum.
     // You can safely ignore this in the class diagram. - Roger deBry
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
   /*get TeamMember here

   set TeamMember here */

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

//   public static void main(String[] args) {
     //set ListItem instance -- Jem: should this be here in Game class?
     //I hope I'm doing this right because I'm not sure how to do it for Arrays

     /*Set Player instance.
      *I've added this back in from where it got deleted.
      *Also, I fixed a bunch of errors that got added in overnight due to a
      *mistake higher in the code.
      *There are only six errors showing right now, all with the list item.
      *Jem, I think you have it almost right.
      * - Jacalyn */
/*
     Player playerOne = new Player();
     playerOne.setName("Alma The Missionary");

     String playerOneName = playerOne.getName();
     System.out.println(playerOne.toString());

     //set Location instance - Jacalyn
     Location location = new Location();
     location.setDescription("The City of Aaron, near Nephihah");

     String locationDescription = location.getDescription();
     System.out.println(location.toString());


     //From Jem
     ListItem[] animalsOne = New ListItem[ItemCount];

     //for animals

     animalsOne.setName("sheep");
     animalsOne.setNumber(12.00);

     String animalsOneName = animalsOne.getName();
     double animalsOneNumber = animalsOne.getNumber();

     System.out.println(animalsOne.toString());

     //for tools
     ListItem[] toolsOne = New ListItem[ItemCount];

     toolsOne.setName("sword");
     toolsOne.setNumber(7.00);

     String animalsOneName = toolsOne.getName();
     double animalsOneNumber = toolsOne.getNumber();

     System.out.println(toolsOne.toString());

     //for provisions
     ListItem[] provisionsOne = New ListItem[ItemCount];

     provisionsOne.setName("helmet");
     provisionsOne.setNumber(7.00);

     String provisionsOneName = provisionsOne.getName();
     double provisionsOneNumber = provisionsOne.getNumber();

     System.out.println(toolsOne.toString());

   }*/
 }
