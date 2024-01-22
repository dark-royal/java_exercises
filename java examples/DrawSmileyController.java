import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
 import javafx.scene.canvas.Canvas;
 import javafx.scene.canvas.GraphicsContext;
 import javafx.scene.paint.Color;

 public class DrawSmileyController { 
 @FXML private Canvas canvas;
 
 // draws a smiley face
 @FXML
 void drawSmileyButtonPressed(ActionEvent event) {
 // get the GraphicsContext, which is used to draw on the Canvas
 GraphicsContext gc = canvas.getGraphicsContext2D();

 // draw the face

 
 gc.strokeOval(10, 10, 280, 280); 
 
 // draw the eyes
 






//Fig. 6.11 | Drawing a smiley face using colors and filled shapes. (Part 1 of 2.)
gc.setFill(Color.YELLOW); 
gc.fillOval(10, 10, 280, 280);
gc.setFill(Color.BLACK); 
gc.fillOval(75, 85, 40, 40); 
gc.fillOval(185, 85, 40, 40);
gc.fillOval(50, 130, 200, 120);
/*294 Chapter 6 Methods: A Deeper Look
Method drawSmileyButtonPressed draws the smiley face when the user presses the
Draw Smiley Button. Line 19 uses GraphicsContext method setFill to set the current fill
color to the predefined Color.YELLOW—all filled shapes will use this fill until you change
it with a subsequent call to setFill.
Line 20 draws a filled circle with diameter 280 to represent the face—when the width
and height arguments are identical, method fillOval draws a circle. Line 21 uses strokeOval with the same arguments as fillOval to outline the face with a black line for better
contrast with the window’s background. Note that the GraphicsContext separately maintains the fill color and stroke color—as you’ve seen, the default stroke color is black. You
can change the stroke color with GraphicsContext method setStroke. Next, line 24 sets
the fill color to Color.BLACK, and lines 25–26 draw two filled circles for the eyes. 
Line 29 draws the mouth as an oval, but this is not quite what we want. To create a
happy face, we’ll touch up the mouth. Line 32 sets the fill color to Color.YELLOW, so any
shapes we draw will blend in with the face. Line 33 draws a rectangle that’s half the mouth’s
height. This erases the top half of the mouth, leaving just the bottom half. To create a better
smile, line 34 draws another oval to slightly cover the upper portion of the mouth. 
GUI and Graphics Case Study Exercises
6.1 Using method fillOval, draw a bull’s-eye that alternates between two random colors, as in
Fig. 6.12. To generate a random color, use the following method call in which red, green and blue
are random values in the range 0–255
31 // "touch up" the mouth into a smile
32 
33 
34 */
Color.rgb(red, green, blue);
gc.setFill(Color.YELLOW); 
gc.fillRect(50, 130, 200, 60);
gc.fillOval(50, 140, 200);
 }
}
