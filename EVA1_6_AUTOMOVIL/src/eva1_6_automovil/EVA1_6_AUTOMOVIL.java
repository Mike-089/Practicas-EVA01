/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author migue
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     * Marca
     * Modelo
     * Placas
     * Año
     * Dueño
     * get y set
     * constructores (default y con argumentos)
     * Imprimir datos
     * calcularAdeudo
     * 2000 y anteriores: $1500
     * 2001-2005: $2000
     * 2006-2010: $2500
     * 2011-2015: $3000
     * 2016-2023: $4000
     * Imprimir datos (incluir adeudo)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CarInfo miCarro = new CarInfo ();
        CarInfo miCarro2 = new CarInfo ("Nisan", "Tsuru","T508HGF", 2006, "Juan Carlos Bodoque");
        
        miCarro.imprimirDatos();
        miCarro2.imprimirDatos();
        
    }
    
}
