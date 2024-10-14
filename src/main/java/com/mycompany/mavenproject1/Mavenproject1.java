/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Gabriel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("El factorial de " + numero +" es " + factorial(numero));
    }
    private static int factorial(int numero){
if(numero >1){
    return factorial(numero-1);
}else{
    return 1;
}
}
}

