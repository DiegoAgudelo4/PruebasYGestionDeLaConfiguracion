/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Operaciones {
    public double suma(double a, double b){
        return a+b;
    }
    public double resta(double a, double b){
        return a-b;
    }
    public double division(double a, double b){
        if (b==0) {
            return 0;
        }
        return a/b;
    }
    public double multiplicacion(double a, double b){
        return a*b;
    }
    public double potenciacion(double a, double b){
        return (double) Math.pow(a, b);
    }
    public double raiz(Double a){
        return (double) Math.sqrt(a);
    }
}
