/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_3;

/**
 *
 * @author uestudiantes
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        String matriz[][] = new String [5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               if(i==j){
                   matriz[i][j]="0";
               }else{
                   matriz[i][j]="*";
               }
            }
        }
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(matriz[i][j]); 
            }
            System.out.println("");
        }
    }
    
}
    

