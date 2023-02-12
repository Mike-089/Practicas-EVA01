/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author migue
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria cuenta1 = new CuentaBancaria("000002",87, "AMLO");

        /*cuenta1.setCliente("Dr. Simi");
        cuenta1.setNumCuenta("000126848");
        cuenta1.setSaldo(40);
        */
        
        //cuenta1.imprimirDatos();
        
        String cliente = cuenta1.getCliente();
        
        System.out.println("Datos del cliente:");
        System.out.println(cliente);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        System.out.println("");
        
        //-----------------------------------------
        
        CuentaBancaria cuenta2 = new CuentaBancaria("097806", 10, "Pedro Paramo");
        System.out.println("Datos del cliente:");
        System.out.println(cuenta2.getCliente());
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
    }

}
