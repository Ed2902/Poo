/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_3;



/**
 *
 * @author uestudiantes
 */
public class Ejercicio_9 {
    
    public static void main(String[] args) {
        int matriz[][] = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               if(i==j){
                   matriz[i][j]=1;
               }else{
                   matriz[i][j]=0;
               }
            }
        }
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j]); 
            }
            System.out.println("");
        }
    }
}
    

