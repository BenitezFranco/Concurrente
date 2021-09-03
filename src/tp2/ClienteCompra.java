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
public class ClienteCompra {

    private String nombre;
    private int[] carroCompra;
    public ClienteCompra(String nam, int[] arr){
        this.nombre=nam;
        this.carroCompra= arr;
    }
    public String getNombre() {
        return nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }
    
}
