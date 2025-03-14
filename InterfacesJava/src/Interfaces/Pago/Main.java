/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Pago;

public class Main {
    public static void main(String[] args) {
        Pago pagoTarjeta = new PagoConTarjeta();
        Pago pagoEfectivo = new PagoConEfectivo();

        pagoTarjeta.procesarPago(150.75);
        pagoEfectivo.procesarPago(80.50);
    }
}