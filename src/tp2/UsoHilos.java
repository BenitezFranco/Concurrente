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
public class UsoHilos {

    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
//Primero, construye un objeto unhilo. 
        //MiHilo mh = new MiHilo();
        //mh.unHilo("#1");
//Luego, construye un hilo de ese objeto. 
        MiHiloThread hiloUno = new MiHiloThread("#1");
        MiHiloThread hiloDos = new MiHiloThread("#2");
        MiHiloThread hiloTres = new MiHiloThread("#3");
//Finalmente, comienza la ejecución del hilo. 
        hiloUno.start();
        hiloDos.start();
        hiloTres.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(" ,");
        }
        try {
            Thread.sleep(100);
            //no cambia nada
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
            System.out.println("Hilo principal finalizado.");
        }
        /*
            a) Si quitamos el sleep los carteles podrian intercarse con las ","
            
            b) No puede terminar primero el main porque esta ejecutando el run
        
            d) Se ejecutan en los tres hilos pero al tener un sleep en el run 
               tienen cierto "orden"(empieza el recuento 0,1,2..... intercalados
               entre cada hilo)
            
        */
    }

}
