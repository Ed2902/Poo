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
public class Ejercicio_2 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int sum = 0;
        int sum2=0;
        
        while (num > 0) {
             sum += num % 10;
             num /= 10;
        }
        
        if(sum>10){
            while (sum > 0) {
             sum2 += sum % 10;
             sum /= 10;
            }
            System.out.println("La raiz digital es: " + sum2);
        }else{
            System.out.println("La raiz digital es: " + sum);
        }
  
    }
    
}
