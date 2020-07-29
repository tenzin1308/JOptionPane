/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Print a line indicating this program will calculate mileage
Print prompt to user asking for miles driven
Read in miles driven
Print prompt to user asking for gallons used
Read in gallons used
Calculate miles per gallon by dividing miles driven by gallons used
Print miles per gallon along with appropriate labels
*/
package milage;
/**
 * @author Tenzin Tashi
 * 06/19/19
 */
// using JOptionPane
import javax.swing.JOptionPane;
public class Milage{

    public static void main(String [] args){
        String input;
        double miles,gallon,milesPerGallon;
        System.out.println("Mileage Calculator");
        input = JOptionPane.showInputDialog("Enter the total miles driven: ");
        miles = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the gallons used:");
        gallon = Double.parseDouble(input);
        if(gallon > 0){
            milesPerGallon = miles / gallon;
            JOptionPane.showMessageDialog(null,String.format("Miles per Gallon is %.1f", milesPerGallon));
        }else{
            JOptionPane.showMessageDialog(null,"Gallon input is incorrect");
        }
        
    }

}

//// using Scanner
//import java.util.Scanner;
//public class Milage{
//    public static void main (String [] args){
//        //variables to store the values of differ data of double type
//        double miles,gallon,milesPerGallon;
//        // Program Message
//        System.out.println("Mileage Calculator");
//        // object to input data from user using scanner
//        Scanner input = new Scanner(System.in);
//        // promt to ask user to enter miles
//        System.out.print("Enter miles driven: ");
//        // get input from user
//        miles = input.nextDouble();
//        // promt to ask user to enter gallon used
//        System.out.print("Enter gallon used: ");
//        // get input from user
//        gallon = input.nextDouble();
//        // check if the entered gallon value is positive number or not
//        if (gallon > 0){
//            // calculate mils per gallon
//            milesPerGallon = miles / gallon;
//            // display the result in screen
//            System.out.printf("Miles per Gallon: %.1f\n",milesPerGallon);
//        }else{
//            // if entered value for gallon is 0 or negative tell user it's invalid
//            System.out.println("You entered invalid amount for gallon ");
//        }
//    }
//}