/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_3;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio_6 {
    
    public static void main(String[] args) {
       int matriz[][]= new int[5][6];
       int num=1;
       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j]=num;
                num= num+2;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
}
