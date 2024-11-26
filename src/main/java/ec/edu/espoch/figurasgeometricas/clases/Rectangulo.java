/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.clases;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Rectangulo {
public double  base;
public double altura;

public Rectangulo(double base,double altura){
    this.base = base;
    this.altura = altura;
    }

 
    public double calcularArea() {
        return base * altura;
    }

 
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
    

