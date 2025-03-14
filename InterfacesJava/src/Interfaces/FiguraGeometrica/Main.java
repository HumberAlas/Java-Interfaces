/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.FiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica rectangulo = new Rectangulo(4, 6);

        System.out.println("Area del circulo: " + circulo.area());
        System.out.println("Perimetro del circulo: " + circulo.perimetro());

        System.out.println("Area del rectangulo: " + rectangulo.area());
        System.out.println("Perimetro del rectangulo: " + rectangulo.perimetro());
    }
}