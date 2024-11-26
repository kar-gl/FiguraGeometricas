/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.clases;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Triangulo {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

 
    public double calcularArea() {
        return (base * altura) / 2;
    }


    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && altura == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
