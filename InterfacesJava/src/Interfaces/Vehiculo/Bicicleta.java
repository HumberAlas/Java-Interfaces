/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Vehiculo;

public class Bicicleta implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La bicicleta comienza a moverse.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }
}