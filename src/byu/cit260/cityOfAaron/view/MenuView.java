//abstract super class for all menu views
package view;

import java.util.Scanner;

public abstract class MainMenu implements ViewInterface{
  //declare all variables common to all menu views
  protected final static Scanner keyboard = new Scanner(System.in);
  protected String menu;
  protected int max;

  //constructor
  public MenuView(String _menu, int _max){
      menu = _menu;
      max = _max;
  }

}
