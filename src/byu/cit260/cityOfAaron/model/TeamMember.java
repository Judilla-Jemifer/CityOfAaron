
package byu.cit260.cityOfAaron.model;

 import java.io.Serializable;
 import java.util.ArrayList;

 public enum TeamMember implements Serializable{

 Clayton("Clayton Thomas", "Master of Duct Tape"),
 Jemifer("Jemifer Judilla", "International Superstar"),
 Jacalyn("Jacalyn Boggs", "Bringer of Chocolate");
  //attributes
   private String name;
   private String title;

   TeamMember(String name, String title) {
   this.name = name;
   this.title = title;
   }
   public String getName() {
     return name;
   }
   public String getTitle() {
     return title;
   }
   @Override
   public String toString() {
     return "TeamMember(" + "name=" + name + ", title=" + title + ')';
   }

 }
