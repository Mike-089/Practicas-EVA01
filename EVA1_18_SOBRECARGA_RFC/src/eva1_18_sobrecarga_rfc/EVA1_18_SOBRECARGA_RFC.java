/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga_rfc;

/**
 *
 * @author migue
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rfc = generarRFC("MIGUEL","CABALLERO","PEÑA",2004,5,17);
        System.out.println(rfc);
        String rfc2 = generarRFC("MIGUEL","CABALLERO",2004,5,17);
        System.out.println(rfc2);
        String rfc3 = generarRFC("MIGUEL",2004,5,17);
        System.out.println(rfc3);
    }
    
    public static String generarRFC(String nombre, String apPat,String apMat, int año, int mes, int dia){
        String apP1 = apPat.charAt(0)+"";
        String apP2 = apPat.charAt(1)+"";
        String apM = apMat.charAt(0)+"";
        String nom = nombre.charAt(0)+"";
        String rfc = apP1+apP2+apM+nom+año+mes+dia+"";
        return rfc;
    }
    public static String generarRFC(String nombre, String apPat, int año, int mes, int dia){
        String apP1 = apPat.charAt(0)+"";
        String apP2 = apPat.charAt(1)+"";
       
        String nom = nombre.charAt(0)+"";
        String rfc = apP1+apP2+"X"+nom+año+mes+dia+"";
        return rfc;
    }
    public static String generarRFC(String nombre,int año, int mes, int dia){
    
        String nom = nombre.charAt(0)+"";
        String rfc = "X"+"X"+nom+año+mes+dia+"";
        return rfc;
    }
}
