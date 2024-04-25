/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double num;
        System.out.println("Introduce un número");
        try{
            num=sc.nextInt();
            System.out.println("Tu número es " + num + ". ");
        
        } catch (InputMismatchException e) {
            System.out.println("El número introducido no es válido. ");    
        }finally{
            System.out.println("¡Chao, pescao!");
        }
    }
}
