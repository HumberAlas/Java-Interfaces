/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ordenable;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 8, 1, 9, 2);
        ListaNumeros listaNumeros = new ListaNumeros(numeros);

        listaNumeros.mostrarLista();
        listaNumeros.ordenar(listaNumeros.getNumeros());
    }
}