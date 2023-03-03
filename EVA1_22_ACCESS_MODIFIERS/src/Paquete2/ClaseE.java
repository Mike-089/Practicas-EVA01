/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 *
 * @author migue
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
     public void prueba(){
        
        ClaseA objA = new ClaseA();
        //objA.publicA;
        //objA.defaultA;
        
        //ClaseB objB = new ClaseB();
        
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        
        //ClaseD objD = new ClaseD();
        
        
        //Clase E esta en otro paquete y archivo 
        //hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE;
       
        //ClaseF es default y es invisible para las clases de este paquete
        ClaseF objF = new ClaseF();
        //objF.defaultF;
        //objF.publicF;
        
    }
}
class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}