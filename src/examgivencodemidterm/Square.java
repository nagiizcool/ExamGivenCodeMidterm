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
public class Square {
    public void Main(){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a number: ");
    System.out.println("Side: ");
    double side = scan.nextDouble();
    Give(side);
    }
    public void Give(double side){
        double ans = (side*side);
        System.out.println("Answer: " + ans);
}
}