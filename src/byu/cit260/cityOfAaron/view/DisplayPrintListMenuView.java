/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.cityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author Jemifer
 
 */



public class DisplayPrintListMenuView {
    
 Scanner keyboard = new Scanner(System.in);
    
private String listMenu;
private int max;

public void ListMenuView(){
    listMenu = "\n***************************"+
               "\n***      LIST MENU      ***"+
               "\n***************************"+
               "\n1 - List or view the animals in the storehouse"+
               "\n2 - List or view the tools in the storehouse"+
               "\n3 - List or view the provisions in the storehouse"+
               "\n4 - List or view the authors of this game";       
              
    max = 4;
  }

public void displayListMenuView(){
    int menuOption;
    do{
      System.out.println(listMenu);

      menuOption = getMenuOption();

      doAction(menuOption);
    }while (menuOption != max);
  }//close displayGameMenuView

  public int getMenuOption(){
    int userInput;
    do{
      userInput = keyboard.nextInt();

      if(userInput < 1 || userInput > max){
        System.out.println("\nOption must be between 1 and " + max);
      }
    }while (userInput < 1 || userInput > max);
    
    return userInput;
  }//close getMenuOption

  public void doAction(int option){
    switch (option) {
      case 1: System.out.println("\n...this is the list of animals in the storehouse...");
        break;
      case 2: System.out.println("\n...these are the tools in the storehouse...");
        break;
      case 3: System.out.println("\n...these are the provisions in the storehouse...");
        break;
      case 4: System.out.println("\n...these are the authors of this game...");
        break;
      
    }//close switch
  }//close doAction

}//close class GameMenuView

