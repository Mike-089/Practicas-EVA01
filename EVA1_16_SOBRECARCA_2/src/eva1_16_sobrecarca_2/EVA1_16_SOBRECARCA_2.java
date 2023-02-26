/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_sobrecarca_2;

/**
 *
 * @author migue
 */
public class EVA1_16_SOBRECARCA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma:" + suma(4,5));
        System.out.println("Suma:" + suma(4.0,5.0));
        System.out.println("Suma:" + suma("Hola ","mundo"));
        suma();
    }               //suma (int, int)
    public static int suma (int val1, int val2){
        return val1+val2;
    }
                     //suma (double, double)
    public static double suma (double val1, double val2){
        return val1+val2;
    }
                       //suma (String + string)
    public static String suma (String val1, String val2){
        return val1+val2;
    }
    
    public static void suma (){
        System.out.println("Metodo sin parametros suma");
    }
    
}
