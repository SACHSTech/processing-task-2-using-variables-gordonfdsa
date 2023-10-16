import processing.core.PApplet;

/**
 * draw a house image which scales its size based off total screen size
 * Conversion from previous code to using width/height is:
 * [(previous value / previous screen size[600]) * width or height]
 * @Gordon Z
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}