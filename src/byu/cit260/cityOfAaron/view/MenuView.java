//abstract super class for all menu views
package byu.cit260.cityOfAaron.view;

import java.util.Scanner;

public abstract class MenuView implements ViewInterface{

  //declare all variables common to all menu views
  protected final static Scanner keyboard = new Scanner(System.in);
  protected String menu; //this string holds the menu string
  protected int max;

  //MenuView constructor
  //Purpose: Initialize the view object with the menu string
  //Parameters: the menu string and the max value
  //Returns: none
  public MenuView(String _menu, int _max){
      menu = _menu;
      max = _max;
  }
@Override public void displayMenu(){
    int menuOption = 0;
    do{
      //display the menu
      System.out.println(menu);
      //get user selection
      menuOption = getMenuOption();
      //perform action
      doAction(menuOption);
      //determine and display next view
      } while (menuOption != max);

  }
}
