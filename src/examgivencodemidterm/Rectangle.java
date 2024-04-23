/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examgivencodemidterm;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Rectangle {
    public void Main(){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a number: ");
    System.out.println("Length: ");
    double length = scan.nextDouble();
    System.out.println("Width: ");
    double width = scan.nextDouble();
    Give(length, width);
    }
    public void Give(double length, double width){
        double ans = (length*width);
        System.out.println("Answer: " + ans);
}
}