/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_3;
import java.util.Scanner;
/**
 *
 * 
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
       
        int numero;
        System.out.print("Ingresa un numero: ");
       
        numero = leer.nextInt();
        
        if(numero<=1){
            System.out.println("error dijite un numero superior a 1");}

    
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}

    
    
    
    
    
    
    

