/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Gabriel
 */
public class circulo {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double area(){
        return Math.PI*radio*radio;
    }
}
