import processing.core.PApplet;

public class Sketch extends PApplet {

  
  public void settings() {
    // put your size call here
    size(800, 800);
  }

  public void setup() {
    //sky 
    background(96, 247, 252);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Set line color to black 
    stroke(0);

    // Draw house main frame scaling to screen size 
    fill(201, 152, 54);
    rect((int)(0.3*width), height/2, (int)(0.4*width), height/3);

    // Draw door scaling to screen size 
    fill(166, 91, 22);
    rect((int)(0.45*width), (int)(0.7*height), width/10, (int)(0.13333*height));

    // Draw grass scaling to screen size 
    fill(52, 224, 75);
    rect(0, 5*height/6, width, height/6);

    // Draw roof scaling to screen size 
    fill(194, 37, 19);
    triangle((int)(0.2*width), height/2, (int)(0.8*width), height/2, width/2, height/4);

    // Draw sun scaling to screen size 
    fill(252, 230, 81);
    ellipse(width, 0, width/3, height/3);
  }

}