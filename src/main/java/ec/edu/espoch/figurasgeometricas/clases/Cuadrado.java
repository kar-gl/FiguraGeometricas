/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.clases;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Cuadrado {
  
    public double lado ;
    
    
    public Cuadrado(double lado ){
      this.lado=lado;
    
      }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
   public double CalcularArea(){
       return lado*lado;
   } 
   public double CalcularPerimetro (){
       return 4*lado;
   }
  }  

