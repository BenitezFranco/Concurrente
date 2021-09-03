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
public class ThreadEjemploRuneable implements Runnable {
    String nombre;
    public ThreadEjemploRuneable(String str) {
        this.nombre = str;
    }
    public String getName(){
        return this.nombre;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
    }

    public static void main(String[] args) {
        new ThreadEjemploRuneable("Maria Jose").run();
        new ThreadEjemploRuneable("Jose Maria").run();
        System.out.println("Termina thread main");
    }
    /*
        a) Los carteles salen en orden porque ejecuta un run y despues ejecuta el 
            otro. Es necesario porque esta implementando una interfaz y no puede
            hacer un constructor con un super
    */

    }
