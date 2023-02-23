/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_parametros;

/**
 *
 * @author migue
 */
public class EVA1_10_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintLn("Hello", 5);
    }
    public static void nPrintLn( String message, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
