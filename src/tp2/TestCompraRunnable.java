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
public class TestCompraRunnable {
    public static void main(String[] args) {
        ClienteCompra cliente1 = new ClienteCompra("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        ClienteCompra cliente2 = new ClienteCompra("Cliente 2", new int[]{1, 3, 5, 1, 1});
        long initialTime = System.currentTimeMillis();
        Thread cajero1= new Thread(new CajeroRunnable("1", cliente1, initialTime));
        Thread cajero2= new Thread(new CajeroRunnable("2", cliente2, initialTime));
        cajero1.start();
        cajero2.start();        
    }
    
}
