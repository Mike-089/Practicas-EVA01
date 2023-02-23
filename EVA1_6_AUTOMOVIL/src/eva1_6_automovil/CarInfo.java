/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author migue
 */

/**
 *
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
 * 2001-2005:$2000
 * 2006-2010: $2500 
 * 2011-2015: $3000 
 * 2016-2023: $4000 
 * Imprimir datos
 * (incluir adeudo)
 *
 */
public class CarInfo {
    
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    
    
    public CarInfo(){//default
        
        marca = "FORD";
        modelo = "FIESTA";
        placas = "123RTH";
        año = 2001;
        dueño = "JUAN";
    }
    public CarInfo(String marcaAuto, String modeloAuto, String placasAuto,int añoAuto, String dueñoAuto){
       
        marca = marcaAuto;
        modelo = modeloAuto;
        placas = placasAuto;
        año = añoAuto;
        dueño = dueñoAuto;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String valorMarca){
        marca = valorMarca;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String valorModelo){
        modelo = valorModelo;
    }
    public String getPlacas(){
        return placas;
    }
    
    public void setPlacas(String valorPlacas){
        placas = valorPlacas;
    }
    public int getAño(){
        return año;
    }
    
    public void setAño(int valorAño){
        año = valorAño;
    }
    public String getDueño(){
        return dueño;
    }
    
    public void setDueño(String valorDueño){
        dueño = valorDueño;
    }
    
    public double calcularRev(){
    int adeudo;
    if(año <=2000){
        adeudo= 1500;
    }else if((año >= 2001) && (año <= 2005)){
        adeudo = 2000;
    }else if((año >= 2006) && (año <= 2010)){
        adeudo = 2500;
    }else if((año >= 2011) && (año <= 2015)){
        adeudo = 3000;
    }else{
        adeudo = 3500;
    }
    return adeudo;
    }
    
    // imprimir datos
    public void imprimirDatos(){
        System.out.println("ADEUDO VEHICULAR: ");
        System.out.println("DUEÑO: " + dueño);
        System.out.println("MARCA: " + marca);
        System.out.println( "MODELO: " + modelo);
        System.out.println("AÑO: " + año);
        System.out.println("ADEUDO: " + calcularRev());
        System.out.println(" ");
        
    }
}
