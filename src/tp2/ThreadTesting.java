/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Barba
 */
public class ThreadTesting {

    public static void main(String[] args) {
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        try {
            miHilo.join();
        } catch (InterruptedException ex) {
        }
        System.out.println("En el main");
    }
    /*
        a) En repetidas ocasiones escribe "En el main" y despues "En la pila"
        b) Es posible si ponemos o no un join    
    */

}
