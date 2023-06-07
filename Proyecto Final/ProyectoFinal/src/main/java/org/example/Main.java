package org.example;

import org.example.controlador.ControladorTarjetas;
import org.example.modelo.TarjetasAMD;
import org.example.vista.VentanaTarjeta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaTarjeta view = new VentanaTarjeta("Proyecto Final");
        ControladorTarjetas controller = new ControladorTarjetas(view);
    }
}