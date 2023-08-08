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
public class Ejercicio_10 {
    public static void main(String[] args) {
       int matriz[]= new int[20];
       int numPar=0;
       int numImpar=0;
   
       
       Random rand = new Random();
       
        for (int i = 0; i < 20; i++) {
           matriz[i] = rand.nextInt(201);
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println(matriz[i]);
            if(matriz[i] % 2 == 0){
              numPar++;
            }else{
               numImpar++; 
            } 
        }
        
        System.out.println("Cantidad de numeros pares: " + numPar);
            System.out.println("Cantidad de numeros impares "+ numImpar);
    }
}
