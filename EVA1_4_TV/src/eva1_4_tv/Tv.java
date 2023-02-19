/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_tv;

/**
 *
 * @author migue
 */
public class Tv {

    private int vol;
    private int chan;
    private boolean power;

    //constructores
    public Tv() {//constructor default
        vol = 98;
        chan = 98;
        power = false;
    }

    // métodos para operar la TV (interfaz)
    public void cambiarEstadoPoder() {
        // verificar el destado de la TV
        if (power == true) {
            power = false;
            System.out.println("Apagando pantalla");
        } else {
            power = true;
            System.out.println("Encendiendo pantalla");
        }
    }

    //volumen
    public void subirVol() {
        if (power) {//la tv esta prendida
            // no debemos de pasarnos de 100
            if (vol < 100) {
                vol++; // acomulador
                System.out.println("Volumen: " + vol);
            }
        }
    }

    public void bajarVol() {
        if (power) {//la tv esta prendida
            if (vol > 0) {
                vol--; // acomulador
                System.out.println("Volumen: " + vol);
            }
        }
    }

    public void subirChan() {
        if (power) {//la tv esta prendida
            chan++;// no debemos de pasarnos de 100
            if (chan > 100) {
                chan = 0;
            }
            System.out.println("Canal: " + chan);
        }
    }

    public void bajarChan() {
        if (power) {//la tv esta prendida
            chan--;// acomulador
            if (chan < 0) {
                chan = 100;
            }
            System.out.println("Canal: " + chan);
        }
    }
}
