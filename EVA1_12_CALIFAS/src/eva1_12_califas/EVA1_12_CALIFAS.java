/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

/**
 *
 * @author migue
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char cali;
        cali = califas(85);//almaceno el resultado en una variable
        System.out.println("Califa para 85: " + cali);
        System.out.println("Califa para 70: " + califas(70));
        //String cali;
        //cali = califas(70);
        califas(100);//ignoro el resultado
    }
    
    
    public static char califas(int califa) {
        char resu;
        if(califa <=70){
        resu= 'D';
        }else if((califa >= 71) && (califa <= 80)){
        resu = 'C';
        }else if((califa >= 81) && (califa <= 90)){
        resu = 'B';
        }else{
        resu = 'A';
        }
        
        
        return resu ;
    }
     /*public static String califas(int califa) {
        String resu;
        if(califa <=70){
        resu= "D";
        }else if((califa >= 71) && (califa <= 80)){
        resu = "C";
        }else if((califa >= 81) && (califa <= 90)){
        resu = "C";
        }else{
        resu = "A";
        }
        
        
        return resu ;
    }*/
}
