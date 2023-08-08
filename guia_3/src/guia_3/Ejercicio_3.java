/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
   
    int matriz[][] = new int [4][4];
       
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
               matriz[i][j]=0; 
            }
        }
        
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(matriz[i][j]); 
            }
            System.out.println("");
     }
    }
}