import javax.swing.JOptionPane;

public class RectangleTest{

public static void main(String[] args){

String input;

int width;

int length;

int area;

input = JOptionPane.showInputDialog("Enter length");
length = Integer.parseInt(input);

input = JOptionPane.showInputDialog("Enter width");
width = Integer.parseInt(input);

area= length * width;

JOptionPane.showMessageDialog(null, "Area of rectangle is" + area);

}


}