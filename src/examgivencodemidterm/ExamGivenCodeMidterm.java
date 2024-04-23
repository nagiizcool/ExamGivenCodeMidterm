/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examgivencodemidterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExamGivenCodeMidterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Square square= new Square();
        Circle circle = new Circle();
        
        System.out.println("INPUT A NUMBER OF YOUR CHOICE");
        System.out.println("1: Triangle");
        System.out.println("2: Rectangle");
        System.out.println("3: Square");
        System.out.println("4: Circle");
        int num = scan.nextInt();
        
        switch (num){
            case 1:
                triangle.Main();
            break;
            case 2:
                rectangle.Main();
            break;
            case 3:
                square.Main();
            break;
            case 4:
                circle.Main();
            break;
        }
    }
    
}
    

