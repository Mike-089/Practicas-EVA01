/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author migue
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area: " + area(4));
        System.out.println("Area: " + area(4.0,5.0));
        System.out.println("Area: " + area(4 ,5,6));
    }
    
    public static double area (double rad){
        return Math.PI*rad*rad;
    }
    public static double area (double base, double h){
        return (base * h)/2.0;
    }
    public static double area (double base1, double base2, double h){
        return h*(base1 + base2)/2;
    }
    
}
