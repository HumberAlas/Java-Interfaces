/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Descuento;

public class Main {
    public static void main(String[] args) {
        Descontable descuentoPorcentaje = new DescuentoPorcentaje(10); // 10% de descuento
        Descontable descuentoFijo = new DescuentoFijo(50); // $50 de descuento

        double precioOriginal = 200.0;

        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio con descuento por porcentaje: " + descuentoPorcentaje.calcularDescuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.calcularDescuento(precioOriginal));
    }
}