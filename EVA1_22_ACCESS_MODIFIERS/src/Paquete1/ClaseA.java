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
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
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

class ClaseB{
      public int publicB;
    int defaultB;
    private int privateB;
}
