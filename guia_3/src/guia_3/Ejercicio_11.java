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
public class Ejercicio_11 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][6];
        int suma = 0;
        int cantidad =0;
        int promedio = 0;
        
         Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = rand.nextInt(16) + 5;
                
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                suma = suma + matriz[i][j];
                cantidad++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        promedio = suma/cantidad;
        System.out.println("");
        
        System.out.println("El promedio de edades es: " + promedio);
    }
    
}
