import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class codeart_final extends PApplet {


 
 
public void setup () {
  
  background (0xff4526FC);
 
}
 



public void draw (){
 text("Sorry, you've reached an error. Remain calm and drag anywhere for help.", pmouseX, pmouseY);

}
  public void settings() {  size (600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "codeart_final" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
