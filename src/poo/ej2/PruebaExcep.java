/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ej2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Barba
 */
public class PruebaExcep {
    
    public static void main(String[] args) {
        int[] arreglo= new int [5];
        arreglo [0]=0;
        arreglo [1]=1;
        arreglo [2]=2;
        arreglo [3]=3;
        arreglo [4]=4;
        mostrarNums(arreglo);
    }
       
    public static boolean confirmarNum(int n) throws Exception{
        boolean val = false;
        int num= (int) Math.floor(Math.random()*10) ;
        System.out.println(num);
        if(num!= n){
            throw new Exception ("Perdiste perdiste no hay nadie peor que vos");
        }else{
            val =true;
        }
        return val;
    }
    
    public static void mostrarNums(int[] arr){
        try{
            int n;
            int j= arr.length+1;
            for(n=0;n<=j;n++){
                System.out.println(arr[n]);
            }
        }catch(Exception ex){
            System.out.println("todo mal");
        }
    
    }
    
    public static boolean confirmarMayor(int n){
        boolean val = true;
        try{
          if(n<= 18)
            Integer.parseInt ("W");        
        }catch(NumberFormatException e){
            System.out.println("Tremendo Quilombo");
            return false;
        }
        return val;
    }
    
}
