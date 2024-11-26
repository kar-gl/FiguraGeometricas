/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.clases;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Circulo{
public double radio;

public Circulo(double radio){
    this.radio=radio;
}
public double calcularArea(){
return Math.PI*radio*radio;    
}
public double calcularPerimetro(){
return 2* Math.PI*radio;
}
}