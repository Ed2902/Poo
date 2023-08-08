/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_3;

import java.util.Random;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
       int matriz[]= new int[15];
       int sumPo=0;
       int sumNe=0;
       int cero=0;
       
       Random rand = new Random();
       
        for (int i = 0; i < 15; i++) {
           matriz[i] = rand.nextInt(201) - 100;
        }
           for (int i = 0; i < 15; i++) {
            
            System.out.println(matriz[i]);
            if(matriz[i]> 0){
              sumPo++;
            }else if (matriz[i]<0) {
               sumNe++;
            }else{
               cero++; 
            } 
        }     
        System.out.println("numeros positivos: " + sumPo);
            System.out.println("numeros negativos "+ sumNe);
                 System.out.println("ceros " + cero);
    }  
    
}
