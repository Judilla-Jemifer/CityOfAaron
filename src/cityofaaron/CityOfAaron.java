/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;


/**
 *
 * @authors Jemifer/Jacalyn/Aaron
 */

public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
    }

}

//set ListItem instance 
//I hope I'm doing this right because I'm not sure how to do it for Arrays



public static void main(String[] args) {

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

    //From Jem - tried to change it to make just one instance
    ListItem[] listItemOne = New ListItem[];

    listItemOne.setName("sheep");
    listItemOne.setNumber(12.00);

    String listItemName = listItemOne.getName();
    double listItemOneNumber = listItemOne.getNumber();

    System.out.println(listItemOne.toString());


  }
}
