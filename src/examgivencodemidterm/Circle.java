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
public class Circle {
    public void Main(){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a number: ");
    System.out.println("Radius: ");
    double radius = scan.nextDouble();
    Give(radius);
    }
    public void Give(double radius){
        double pi = 3.14;
        double ans = pi*(radius*radius);
        System.out.println("Answer: " + ans);
}
}