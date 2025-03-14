/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Alimentacion;

public class Animal implements Alimentacion {
    @Override
    public void comer() {
        System.out.println("El animal esta comiendo directamente con la boca.");
    }
}
