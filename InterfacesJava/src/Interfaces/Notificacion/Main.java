/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Notificacion;

public class Main {
    public static void main(String[] args) {
        Notificable correo = new CorreoElectronico();
        Notificable sms = new SMS();

        correo.enviarNotificacion("Su pedido ha sido enviado.");
        sms.enviarNotificacion("Su codigo de verificacion es 12345.");
    }
}