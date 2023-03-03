/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author migue
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        
        ClaseA objA = new ClaseA();
        //objA.publicA;
        //objA.defaultA;
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        // Clase D es default en otro archivo pero mismo paquete
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        // objD.publicD; atributos visibles
        // objD.default; 
        
        //Clase E esta en otro paquete y archivo 
        //hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE;
       
        //ClaseF es default y es invisible para las clases de este paquete
        //ClaseF objF = new ClaseF();
    }
}
class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
