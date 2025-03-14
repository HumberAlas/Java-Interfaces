/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        perro.mover();

        gato.hacerSonido();
        gato.mover();
    }
}