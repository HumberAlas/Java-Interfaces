/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();

        coche.arrancar();
        coche.detener();

        bicicleta.arrancar();
        bicicleta.detener();
    }
}