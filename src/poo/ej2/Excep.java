/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej2;

import java.io.*;

/**
 *
 * @author Barba
 */
public class Excep {
    public static void main(String[] args) throws IOException {
        int aux2=0;
      try{
        aux2=   aux2+1;
        aux2 = aux2+ Integer.parseInt ("W");
        System.out.println(aux2);
        throw new IOException();
        }catch(NumberFormatException e){
            aux2 = 8000;
            System.out.println("en catch "+aux2);
        }finally{
            aux2 = aux2 + Integer.parseInt ("42");
            System.out.println("en finally "+aux2);
      }
      aux2 = aux2 + Integer.parseInt ("42");
            System.out.println("fuera del finally "+aux2);
    }  
}
    
