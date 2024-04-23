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
public class Triangle {
    public void Main(){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a number: ");
    System.out.println("Base:");
    double base = scan.nextDouble();
    System.out.println("Heigth:");
    double height = scan.nextDouble();
    Give(base, height);
    }
    public void Give(double base, double heigth){
        double ans = (base*heigth)/2;
        System.out.println("Answer: " + ans);
    }
}
