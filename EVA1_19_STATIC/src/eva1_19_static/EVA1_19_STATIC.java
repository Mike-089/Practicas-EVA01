/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static;

/**
 *
 * @author migue
 */
public class EVA1_19_STATIC {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI" + Math.PI);
        System.out.println("Numero aleatorio: " + Math.random());
        Utilerias utilerias = new Utilerias();
        utilerias.Saludo();
        Utilerias.otroSaludo();
        Saludo2();// SI NO ES ESTATICO, Y NO SE HA CREADO UN OBJETO, EL METODO NO EXISTE
        
    }
    public void Saludo2(){
        System.out.println("Hola");
    }
}

class Utilerias{
    // ESTE METODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE. SOLO SE USA A TRAVES DE UN OBJETO
    public void Saludo(){
        System.out.println("Hola!!");
    }
    public static void otroSaludo(){
        // ESTE METODO EXISTE EN EL MOMENTO QUE EL PROGRAMA INICIA SU EJECUCION. 
        //NO NECESITA QUE SE CREE UN OBJETO DE CLASE PARA PODER UTILIZARLO. SE USA A TRAVES DE LA CLASE
        System.out.println("Otro saludo (static)");
    }
}
class OtraClase{
    
}
