/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author migue
 */
public class CuentaBancaria {

    private String numCuenta;
    private String cliente;
    private double saldo;
    //constructores
    //default y con argumentos
    //
    public CuentaBancaria(){//constructor default
        numCuenta = "------";
        saldo = 0;
        cliente = "------";
    }
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        numCuenta = nCuenta;
        saldo = otroSaldo;
        cliente = nCliente;
    }
    
    
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String hola) {
        numCuenta = hola;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String valor) {
        cliente = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        saldo = valor;
    }

    public void imprimirDatos() {
        System.out.println("Datos del cliente: ");
        //concatenacion
        //+ suma (numeros) + concatena <-- sobrecarga de operadores
        System.out.println("Nombre del cliente: " + cliente);
        System.out.println("Cuenta bancaria: " + numCuenta);
        System.out.println("Saldo: " + saldo);

        System.out.println("");
    }
}
