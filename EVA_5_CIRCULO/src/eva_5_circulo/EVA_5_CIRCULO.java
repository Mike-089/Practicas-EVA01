/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_5_circulo;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class EVA_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle miCirculo = new Circle();
        
        System.out.println("Ingrese el valor de su radio");
        Scanner sc = new Scanner(System.in);
        double cir1 = sc.nextDouble();
        
        miCirculo.setRad(cir1);
        
        miCirculo.setArea(0);
        miCirculo.setCircun(0);
        
        
        if (miCirculo.getRad()>0){
        System.out.println("El area del circulo es: " + miCirculo.getArea());
        System.out.println("El perimetro del circulo es: " + miCirculo.getCircun());
        System.out.println("");
        }
        
        System.out.println("Ingrese el valor de su radio");
        double cir2 = sc.nextDouble();
        
        Circle miCirculo2 = new Circle(cir2);
        //miCirculo2.setRad(0);
        //System.out.println("El rdio del circulo 2 es: " + miCirculo2.getRad());
        
        miCirculo2.setArea(0);
        miCirculo2.setCircun(0);
        
        if (miCirculo2.getRad()>0){
        System.out.println("El area del circulo es: " + miCirculo2.getArea());
        System.out.println("El perimetro del circulo es: " + miCirculo2.getCircun());
        }
        
    }
    
}
