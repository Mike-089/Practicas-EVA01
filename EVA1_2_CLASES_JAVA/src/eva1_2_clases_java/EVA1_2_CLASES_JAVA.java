/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author migue
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLASE ES LA RECEETA:
        //OBJETO ES LA PLANTILLA
        //INSTANCIACION:
        //1. Declarar el identificador para el objeto
        //2. Asignar memoria con new
        //3. Invocar su constructor
        //Persona()--> constructor;
        //constructor --> metodo

        Persona perso1 = new Persona();
        Persona perso2 = new Persona();
        //System.out.println(perso1);
        /*
        // ESTA SECCION ES PORQUE INICIAMOS CON LOS ATRIBUTOS CON MODIFICADOR DEFAULT
        
        perso1.nombre = "Miguel";
        perso1.apellido = "Caballero";
        perso1.edad = 18;
        perso1.estadoCivil = false; // true es casado
        
        System.out.println(perso1.nombre);*/

        perso1.setNombre("Miguel");
        perso1.setApellido("Caballero");
        perso1.setEdad(18);
        perso1.setEstadoCivil(false);
        
        /*
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEstadoCivil());
        */
        
        perso1.imprimirDatos();
        
        perso2.setNombre("Carlos");
        perso2.setApellido("Carrillo");
        perso2.setEdad(18);
        perso2.setEstadoCivil(false);
        
        perso2.imprimirDatos();
        
    }

}
