/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Barba
 */
public class Cajero {
    //comentario

    private String nombre; // Agregar Constructor, y métodos de acceso 
    public Cajero(String nam){
        this.nombre=nam;
    }

    public void procesarCompra(ClienteCompra cliente, long timestamp) {
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timestamp) / 1000 + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + "->Tiempo: " + (System.currentTimeMillis() - timestamp) / 1000 + "seg");
        }
        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - timestamp) / 1000 + "seg");
    }
    public void esperarXsegundos(int n){
        try{
          Thread.sleep(1000*n);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
