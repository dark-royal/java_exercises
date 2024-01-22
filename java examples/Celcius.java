import javax.swing.JOptionPane;


public class Celcius{

public static void main(String[] args){

String input;

double celcius;

double fahrenheit;


input = JOptionPane.showInputDialog("Enter celcius: ");
celcius = Double.parseDouble(input);

fahrenheit = (1.8 * celcius) + 32;

JOptionPane.showMessageDialog(null, "The fahrenheit" + fahrenheit);



}

}