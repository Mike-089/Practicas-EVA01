/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva_5_circulo;

/**
 *
 * @author migue
 */
public class Circle {

    private double rad;
    private double area;
    private double circun;

    public Circle() {//constructor default
        rad = 1;
    }

    public Circle(double rad2) {
        rad = rad2;
       
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double hola) {
        rad = hola;
    }

    public double getCircun() {
        return circun;
    }

    public void setCircun(double valor) {
        //
        circun = valor;
        if (rad > 0) {
   
            circun = (2 * rad * Math.PI);
        } else {
            System.out.println("introduzca un numero mayor a 0");
            //System.out.println("Circunferencia: "+ circun);
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double valor) {
        // 
        area = valor;

        area = (Math.pow(rad, 2) * Math.PI);
        //System.out.println("Area: "+ area);

    }

}
