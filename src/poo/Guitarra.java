/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Barba
 */
class Guitarra extends Instrumento {
    public void tocar() {
        System.out.println("Guitarra.tocar()");
}
    public String tipo() { return "Guitarra"; }
        public void afinar() {}
}